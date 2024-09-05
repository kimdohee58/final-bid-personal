"use client";
import React, { useEffect, useState } from "react";
import { useRouter, useParams } from "next/navigation";

export default function AmenityUpdate() {
    const [value, setValue] = useState<AmenityModel | null>(null); // 데이터 초기 상태는 null
    const [loading, setLoading] = useState<boolean>(true); // 로딩 상태를 추가
    const [error, setError] = useState<string | null>(null); // 에러 상태를 추가
    const [name, setName] = useState<string>(''); // 입력 필드 상태 추가
    const router = useRouter();
    const params = useParams(); // useParams를 사용하여 URL 파라미터 추출

    useEffect(() => {
        const id = params.id as string; // URL 파라미터에서 id를 문자열로 추출

        if (id) {
            setLoading(true); // 데이터 요청 시작 시 로딩 상태로 설정
            fetch(`http://211.188.50.47:8080/amenities/findById/${id}`)
                .then((response) => {
                    if (!response.ok) {
                        throw new Error('Network response was not ok');
                    }
                    return response.json();
                })
                .then((data: AmenityModel) => {
                    setValue(data);
                    setName(data.name); // 입력 필드 상태 설정
                    setLoading(false); // 데이터 로딩 완료 시 로딩 상태 해제
                })
                .catch((error) => {
                    console.error('There has been a problem with your fetch operation:', error);
                    setError('Failed to load data.'); // 에러 메시지 설정
                    setLoading(false); // 에러 발생 시 로딩 상태 해제
                });
        }
    }, [params.id]); // params.id가 변경될 때마다 이펙트 실행

    const handleUpdate = () => {
        if (value) {
            fetch(`http://211.188.50.47:8080/amenities/updateById`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ ...value, name }),
            })
                .then((response) => {
                    if (!response.ok) {
                        throw new Error('Network response was not ok');
                    }
                    return response.json();
                })
                .then(() => {
                    alert('Item updated successfully.');
                    router.push(`/amenities/details/${value.id}`);
                })
                .catch((error) => {
                    console.error('There has been a problem with your update operation:', error);
                    alert('Failed to update item.');
                });
        }
    };

    return (
        <div className="p-4">
            <h1 className="text-2xl font-bold">Update Amenity</h1>
            {loading ? (
                <p>Loading...</p> // 로딩 중 표시
            ) : error ? (
                <p>{error}</p> // 에러 발생 시 표시
            ) : value ? (
                <div className="mt-4">
                    <label className="block mb-2">
                        <strong>Name:</strong>
                        <input
                            type="text"
                            value={name}
                            onChange={(e) => setName(e.target.value)}
                            className="border p-2 w-full"
                        />
                    </label>
                    <button
                        className="bg-blue-500 text-white py-2 px-4 rounded"
                        onClick={handleUpdate}
                    >
                        Save Changes
                    </button>
                    <button
                        className="bg-blue-500 text-white py-2 px-4 rounded ml-2"
                        onClick={() => router.push(`/amenities/details/${value.id}`)}
                    >
                        Cancel
                    </button>
                </div>
            ) : (
                <p>No data found.</p> // 데이터가 없는 경우 표시
            )}
        </div>
    );
}
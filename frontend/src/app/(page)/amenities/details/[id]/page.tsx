"use client";
import React, { useEffect, useState } from "react";
import { useRouter, useParams } from "next/navigation";

export default function AmenityDetails() {
    const [value, setValue] = useState<AmenityModel | null>(null); // 데이터 초기 상태는 null
    const [loading, setLoading] = useState<boolean>(true); // 로딩 상태를 추가
    const [error, setError] = useState<string | null>(null); // 에러 상태를 추가
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
                    setLoading(false); // 데이터 로딩 완료 시 로딩 상태 해제
                })
                .catch((error) => {
                    console.error('There has been a problem with your fetch operation:', error);
                    setError('Failed to load data.'); // 에러 메시지 설정
                    setLoading(false); // 에러 발생 시 로딩 상태 해제
                });
        }
    }, [params.id]); // params.id가 변경될 때마다 이펙트 실행

    const handleDelete = () => {
        if (value) {
            const confirmed = window.confirm('Are you sure you want to delete this item?');
            if (confirmed) {
                fetch(`http://211.188.50.47:8080/amenities/deleteById/${value.id}`, {
                    method: 'DELETE',
                })
                    .then((response) => {
                        if (!response.ok) {
                            throw new Error('Network response was not ok');
                        }
                        return response.json();
                    })
                    .then(() => {
                        alert('Item deleted successfully.');
                        router.push("/amenities/list");
                    })
                    .catch((error) => {
                        console.error('There has been a problem with your delete operation:', error);
                        alert('Failed to delete item.');
                    });
            }
        }
    };

    return (
        <div className="p-4">
            <button
                className="rounded-full bg-blue-500 text-white py-2 px-4"
                onClick={() => router.push(`/amenities/update/${value?.id}`)}
            >
                Update
            </button>
            <button
                className="rounded-full bg-red-500 text-white py-2 px-4 ml-2"
                onClick={handleDelete}
            >
                Delete
            </button>
            <button
                className="bg-blue-500 text-white py-2 px-4 rounded ml-2"
                onClick={() => router.push("/amenities/list")}
            >
                Back to List
            </button>
            {loading ? (
                <p>Loading...</p> // 로딩 중 표시
            ) : error ? (
                <p>{error}</p> // 에러 발생 시 표시
            ) : value ? (
                <div className="mt-4">
                    <h1 className="text-2xl font-bold">Amenity Details</h1>
                    <p><strong>ID:</strong> {value.id}</p>
                    <p><strong>Name:</strong> {value.name}</p>
                    {/* 필요한 다른 필드를 여기에 추가 */}
                </div>
            ) : (
                <p>No data found.</p> // 데이터가 없는 경우 표시
            )}
        </div>
    );
}
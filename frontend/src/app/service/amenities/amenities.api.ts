// tsx와 달리 렌더링 할 수 없음

export async function insertAmenity(amenity: AmenityModel): Promise<any | { status: number }> {
    try {
        console.log(amenity)
        // json의 이름이 body가 아니라 그냥 param을 body에 담아서 보내는 것
        const body = {
            id: amenity.id,
            name: amenity.name,
        }

        const response = await fetch('http://211.188.50.47:8080/amenities/save', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(body), // stringify : java는 무조건 string으로 만들어서 보내서 그쪽에서 casting 해야 함
        })
        if (!response.ok) {
            const errorData = await response.json();
            throw new Error(errorData.message || 'Network response was not ok');
        }

        return response.status; // HTTP 상태 코드 반환
    } catch (error: any) {
        console.error('Failed to submit amenity:', error);
        return 500; // 서버 오류 발생 시 500 반환
    }
}

/* gpt
// tsx와 달리 렌더링 할 수 없음

import {useRouter} from "next/navigation";
import {useState} from "react";

export async function insertAmenity(amenity: AmenityModel): Promise<any | { status: number }> {
    const [loading, setLoading] = useState<boolean>(true); // 로딩 상태를 추가
    const [error, setError] = useState<string | null>(null); // 에러 상태를 추가
    const router = useRouter();

    try {
        // json의 이름이 body가 아니라 그냥 param을 body에 담아서 보내는 것
        const body = {
            id: amenity.id,
            name: amenity.name,
        }

        const response = await fetch('http://211.188.50.47:8080/amenities/save', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(body),
        });

        if (!response.ok) {
            const errorData = await response.json();
            throw new Error(errorData.message || 'Network response was not ok');
        }

        const result = await response.json();
        alert('Amenity added successfully.');
        router.push('/amenities/list'); // 성공적으로 추가 후 목록 페이지로 이동
    } catch (error: any) {
        console.error('There has been a problem with your fetch operation:', error);
        setError(error.message || 'Failed to add amenity.'); // 에러 메시지 설정
    } finally {
        setLoading(false); // 로딩 상태 해제
    }
}
*/


// "use client"
// import {ChangeEvent, FormEvent, SetStateAction, useState} from "react";
// import {insertAmenity} from "@/app/service/amenities/amenities.api";
// import Amenities from "@/app/(page)/amenities/page";
//
// export default function Insert() {
//     // 상태 변수 정의
//     const [amenity, setAmenity] = useState<AmenityModel>();
//
//     // 입력값 변경 핸들러
//     const handleChange = (event: ChangeEvent<HTMLInputElement>) => {
//         setAmenity(event.target.value);
//     };
//
//     // 폼 제출 핸들러
//     const handleSubmit = async (event: FormEvent<HTMLFormElement>) => {
//         event.preventDefault(); // 기본 폼 제출 동작 방지
//         console.log('Submitted Name:', name);
//         /*try {
//             const response = await fetch('http://211.188.50.47:8080/amenities/save', {
//                 method: 'POST',
//                 headers: {
//                     'Content-Type': 'application/json',
//                 },
//                 body: JSON.stringify(name),
//             });
//
//             if (!response.ok) {
//                 throw new Error(`Network response was not ok: ${response.statusText}`);
//             }
//
//             const result = await response.json();
//             console.log('Response:', result);
//
//             // 성공적인 응답 후 alert 띄우기
//             alert('Name submitted successfully!');
//             setName(''); // 폼 제출 후 입력 필드 초기화
//
//         } catch (error) {
//             console.error('Error:', error);
//             alert('Failed to submit name. Please try again.');
//         }*/
//         insertAmenity(amenity)
//     };
//
//     return (
//         <>
//             Welcome to Insert!!!
//             <div>
//                 <h1>Enter Your Name</h1>
//                 <form onSubmit={handleSubmit}>
//                     <label>
//                         Name:
//                         <input
//                             type="text"
//                             value={amenity}
//                             onChange={handleChange}
//                         />
//                     </label>
//                     <button type="submit">Submit</button>
//                 </form>
//             </div>
//         </>
//     )
// }

"use client";
import {ChangeEvent, FormEvent, useState} from "react";
import {insertAmenity} from "@/app/service/amenities/amenities.api";
import {useRouter} from "next/navigation";

export default function Insert() {
    // 상태 변수 정의
    const [amenity, setAmenity] = useState<AmenityModel>({id: 0, name: ''});
    const [loading, setLoading] = useState<boolean>(false); // 로딩 상태 추가
    const [error, setError] = useState<string | null>(null); // 에러 상태 추가
    const router = useRouter();

    // 입력값 변경 핸들러
    const handleChange = (event: ChangeEvent<HTMLInputElement>) => {
        setAmenity(prev => ({...prev, name: event.target.value}));
    };

    // 폼 제출 핸들러
    const handleSubmit = async (event: FormEvent<HTMLFormElement>) => {
        event.preventDefault(); // 기본 폼 제출 동작 방지
        console.log('Submitted Amenity:', amenity);
        setLoading(true); // 로딩 시작

        try {
            const status = await insertAmenity(amenity);

            if (status === 200) {
                alert('Amenity added successfully.');
                router.push('/amenities/list'); // 성공적으로 추가 후 목록 페이지로 이동
            } else {
                throw new Error('Failed to submit amenity.');
            }
        } catch (error: any) {
            console.error('There has been a problem with your fetch operation:', error);
            setError(error.message || 'Failed to add amenity.'); // 에러 메시지 설정
        } finally {
            setLoading(false); // 로딩 상태 해제
        }
    };

    return (
        <div className="p-4">
            <h1 className="text-2xl font-bold">Insert Amenity</h1>
            {loading ? (
                <p>Loading...</p> // 로딩 중 표시
            ) : (
                <form onSubmit={handleSubmit}>
                    <label className="block mb-2">
                        <strong>Name:</strong>
                        <input
                            type="text"
                            value={amenity.name}
                            onChange={handleChange}
                            className="border p-2 w-full"
                            required
                        />
                    </label>
                    {error && <p className="text-red-500">{error}</p>} {/* 에러 메시지 표시 */}
                    <button
                        type="submit"
                        className="bg-blue-500 text-white py-2 px-4 rounded"
                    >
                        Submit
                    </button>
                </form>
            )}
        </div>
    );
}
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
import { ChangeEvent, FormEvent, useState } from "react";
import { insertAmenity } from "@/app/service/amenities/amenities.api";

export default function Insert() {
    // 상태 변수 정의
    const [amenity, setAmenity] = useState<AmenityModel>({ id: 0, name: '' });

    // 입력값 변경 핸들러
    const handleChange = (event: ChangeEvent<HTMLInputElement>) => {
        setAmenity(prev => ({ ...prev, name: event.target.value }));
    };

    // 폼 제출 핸들러
    const handleSubmit = async (event: FormEvent<HTMLFormElement>) => {
        event.preventDefault(); // 기본 폼 제출 동작 방지
        console.log('Submitted Amenity:', amenity);
        await insertAmenity(amenity)
    };

    return (
        <>
            Welcome to Insert!!!
            <div>
                <h1>Enter Your Name</h1>
                <form onSubmit={handleSubmit}>
                    <label>
                        Name:
                        <input
                            type="text"
                            value={amenity.name}
                            onChange={handleChange}
                        />
                    </label>
                    <button type="submit">Submit</button>
                </form>
            </div>
        </>
    );
}
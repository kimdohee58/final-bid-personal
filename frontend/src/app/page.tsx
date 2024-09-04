"use client"
import Image from "next/image";
import React, {useEffect, useState} from "react";
import {useRouter} from "next/navigation"; // client 컴포넌트에서만 작동하므로 use client 명시 필수

// interface Amenity {
//     id: number,
//     name: string,
//     dormAmenity: string[],
// }

export default function Home() { // default 2개일 수는 없음
    const [value, setValue] = useState<AmenityModel[]|[]>([]); //  hook

    /*useEffect(() => {
        fetch('http://211.188.50.47:8080/amenities/count', {
            method: 'GET',
            mode: 'cors',
            credentials: 'same-origin',
            headers: {
                "Content-Type": "application/json",
                "Accept": "application/json"
            }
        })
            .then((response) => response.json())
            .then(data => setValue(data));
    }, []); // [] 없으면 1회성으로만 렌더링되고, 있으면 [] 사이에 있는 대상의 state가 변경될 때마다 렌더링*/

    // 정민이 코드
    useEffect(() => {
        fetch('http://211.188.50.47:8080/amenities/')
            .then((response) => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then((data) => {
                console.log(data);
                // alert(JSON.stringify(data));
                setValue(data);
            })
            .catch((error) => {
                console.error('There has been a problem with your fetch operation:', error);
            });
    }, []);

    const router = useRouter(); //next 13 + app directory + "use client" 키워드를 사용할 때는 'next/router'가 아닌 'next/navigation' 모듈을 이용하자.

    return (
        <main className="flex min-h-screen flex-col items-center justify-between p-24">
            <button className="tounded-full ..." onClick={() => router.push("/amenities/insert")}>Go Save</button>
            <table className="table-auto">
                <thead>
                <tr className="border border-indigo-600">
                    <th>id</th>
                    <th>name</th>
                </tr>
                </thead>
                {/* tbody == list */}
                <tbody>
                {
                    value.map((v, index) => {
                        return (
                            <tr key={index}>
                                <td>{v.id}</td>
                                <td>{v.name}</td>
                            </tr>
                        )
                    })
                }
                </tbody>
            </table>
        </main>
    );
}

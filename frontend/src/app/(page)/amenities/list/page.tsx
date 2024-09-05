"use client"
import React, {useEffect, useState} from "react";
import {useRouter} from "next/navigation";

export default function Amenities() {
    const [value, setValue] = useState<AmenityModel[] | []>([]); //  hook

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
        <>
            <button
                className="rounded-full ... bg-blue-500 text-white py-2 px-4" // Example styling; adjust as needed
                onClick={() => router.push("/amenities/insert")}
            >
                Go Save
            </button>
            <table className="table-auto w-full mt-4">
                <thead>
                <tr className="border border-indigo-600">
                    <th className="px-4 py-2">id</th>
                    <th className="px-4 py-2">name</th>
                </tr>
                </thead>
                <tbody>
                {
                    value.map((v) => (
                        <tr key={v.id} className="cursor-pointer" onClick={() => router.push(`/amenities/details/${v.id}`)}>
                            <td className="border px-4 py-2">{v.id}</td>
                            <td className="border px-4 py-2">{v.name}</td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
    );
}
// tsx와 달리 렌더링 할 수 없음

export async function insertAmenity(amenity: AmenityModel): Promise<any | { status: number }> {
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
            body: JSON.stringify(body), // stringify : java는 무조건 string으로 만들어서 보내서 그쪽에서 casting 해야 함
        })
        if (response.status === 500) {
            throw new Error('Failed to submit amenity.');
        }

        const data: any = await response.json()
        console.log(data)
        return data
    } catch (error) {
        console.error(error)
        alert('Failed to submit amenity. Please try again.');
        return {status: 500};
    }
    // return await axios.post<AmenityModel>('$(API_URL}/amenities', amenities);
}
package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.BookingEntity;
import shop.biday.model.entity.DormEntity;
import shop.biday.model.entity.RoomEntity;
import shop.biday.model.entity.RoomImgEntity;

import java.util.List;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class RoomModel {

    private String name;

    private String description;

    private int person;

    private int price;

    private String type;
    private DormEntity dorm;
    private List<BookingEntity> bookingEntities;
    private List<RoomImgEntity> roomEntities;

    public RoomEntity toEntity() {
        return RoomEntity.builder()
                .name(name)
                .description(description)
                .person(person)
                .price(price)
                .type(type)
                .dorm(dorm)
                .bookings(bookingEntities)
                .images(roomEntities)
                .build();
    }

}

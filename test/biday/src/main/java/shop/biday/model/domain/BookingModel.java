package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.*;

import java.time.LocalDateTime;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class BookingModel {
    private Long id;
    private int person;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String status;
    private UsersEntity users;
    private RoomEntity room;
    private PaymentEntity payment;
    private ReviewEntity review;

    public BookingEntity toEntity() {
        return BookingEntity.builder()
                .id(id)
                .person(person)
                .checkIn(checkIn)
                .checkOut(checkOut)
                .status(status)
                .user(users)
                .room(room)
                .payment(payment)
                .review(review)
                .build();
    }
}

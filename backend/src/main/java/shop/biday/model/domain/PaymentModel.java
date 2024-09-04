package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.BookingEntity;
import shop.biday.model.entity.PaymentEntity;
import shop.biday.model.entity.UsersEntity;

import java.time.LocalDateTime;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class PaymentModel{
    private Long id;
    private String paymentKey;
    private String orderId;

    private int totalAmount;

    private String status;

    private LocalDateTime approvedAt;

    private UsersEntity users;
    private BookingEntity booking;

    public PaymentEntity toEntity() {
        return PaymentEntity.builder()
                .id(id)
                .paymentKey(paymentKey)
                .orderId(orderId)
                .totalAmount(totalAmount)
                .status(status)
                .approvedAt(approvedAt)
                .users(users)
                .booking(booking)
                .build();
    }
}

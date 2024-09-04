package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class UsersModel {
    private Long id;
    private String email;
    private String password;
    private String name;
    private int phoneNum;
    private Role role;
    private String status;
//    private LocalDateTime createAt;
//    private LocalDateTime updateAt;
//    private List<ReviewEntity> reviewEntityList;
//    private List<WishEntity> wishEntityList;
//    private List<DormEntity> dormEntities;
//    private List<BookingEntity> bookingEntityList;

    public UsersEntity toEntity() {
        return UsersEntity.builder()
                .id(id)
                .email(email)
                .password(password)
                .name(name)
                .phoneNum(phoneNum)
                .role(role)
                .status(status)
//                .createAt(createAt)
//                .updateAt(updateAt)
//                .reviews(reviewEntityList)
//                .wish(wishEntityList)
//                .dorms(dormEntities)
//                .bookings(bookingEntityList)
                .build();
    }
}

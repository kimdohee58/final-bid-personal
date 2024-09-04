package shop.biday.model.domain;

import org.springframework.stereotype.Component;
import shop.biday.model.entity.BookingEntity;
import shop.biday.model.entity.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.sql.In;
import shop.biday.model.entity.RtagEntity;
import shop.biday.model.entity.UsersEntity;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class ReviewModel {
    private Long id;
    private String content;
    private double rate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private UsersEntity users;
    private BookingEntity booking;
    private List<RtagEntity> rTags;

    public ReviewEntity toEntity() {
        return ReviewEntity.builder()
                .content(content)
                .createAt(createdAt)
                .updateAt(updatedAt)
                .rate(rate)
                .user(users)
                .booking(booking)
                .createAt(createdAt)
                .updateAt(updatedAt)
                .rTags(rTags)
                .build();
    }
}

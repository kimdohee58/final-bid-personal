package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.DormEntity;
import shop.biday.model.entity.UsersEntity;
import shop.biday.model.entity.WishEntity;

import java.time.LocalDateTime;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class WishModel {
    private Long id;
    private UsersEntity users;
    private DormEntity dorm;

    public WishEntity toEntity() {
        return WishEntity.builder()
                .id(id)
                .user(users)
                .dorm(dorm)
                .build();
    }
}

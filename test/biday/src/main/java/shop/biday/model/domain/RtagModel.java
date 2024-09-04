package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.ReviewEntity;
import shop.biday.model.entity.RtagEntity;
import shop.biday.model.entity.TagEntity;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class RtagModel {
    private Long id;
    private ReviewEntity reviewEntity;
    private TagEntity tagEntity;

    public RtagEntity toEntity() {
        return RtagEntity.builder()
                .id(id)
                .review(reviewEntity)
                .tag(tagEntity)
                .build();
    }
}

package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.AmenityEntity;
import shop.biday.model.entity.BookingEntity;
import shop.biday.model.entity.DamenityEntity;

import java.util.List;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class AmenityModel {
    private Long id; // 댓글 고유
    private String name;
    private List<DamenityEntity> dormAmenities;

    public AmenityEntity toEntity() {
        return AmenityEntity.builder()
                .id(id)
                .name(name)
                .dormAmenities(dormAmenities)
                .build();
    }
}

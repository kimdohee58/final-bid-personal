package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.AmenityEntity;
import shop.biday.model.entity.DamenityEntity;
import shop.biday.model.entity.DormEntity;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class DamenityModel {
    private Long id;
    private AmenityEntity amenity;
    private DormEntity dorm;

    public DamenityEntity toEntity() {
        return DamenityEntity.builder()
                .id(id)
                .amenity(amenity)
                .dorm(dorm)
                .build();
    }
}

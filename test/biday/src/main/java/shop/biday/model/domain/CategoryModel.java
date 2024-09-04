package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.CategoryEntity;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel { // == Dto
    private Long id;
    private String name;

    public CategoryEntity toEntity() {
        return CategoryEntity.builder()
                .id(id)
                .name(name)
                .build();
    }
}

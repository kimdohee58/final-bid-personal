package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.RtagEntity;
import shop.biday.model.entity.TagEntity;

import java.util.List;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class TagModel {
    private Long id;
    private String name;
    private String PN;
    private List<RtagEntity> rtags;

    public TagEntity toEntity() {
        return TagEntity.builder()
                .id(id)
                .name(name)
                .PN(PN)
                .rtags(rtags)
                .build();
    }
}

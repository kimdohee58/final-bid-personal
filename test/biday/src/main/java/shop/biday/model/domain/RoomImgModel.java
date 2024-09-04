package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.RoomEntity;
import shop.biday.model.entity.RoomImgEntity;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class RoomImgModel {
    private Long id;
    private String name;
    private String nameOriginal;
    private String size;
    private String ext;
    private RoomEntity room;

    public RoomImgEntity toEntity() {
        return RoomImgEntity.builder()
                .id(id)
                .name(name)
                .nameOriginal(nameOriginal)
                .size(size)
                .ext(ext)
                .build();
    }
}

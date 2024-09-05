package shop.biday.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@Table(name = "amenities")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class AmenityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 댓글 고유

    private String name;

//    @OneToMany(mappedBy = "amenity")
//    private List<DamenityEntity> dormAmenities;
}

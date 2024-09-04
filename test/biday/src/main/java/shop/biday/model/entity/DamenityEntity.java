package shop.biday.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@ToString
@Table(name = "d_amenities")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DamenityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 댓글 고유

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "amenity_id")
    private AmenityEntity amenity; // 카테고리

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dorm_id")
    private DormEntity dorm; // 판매자
}

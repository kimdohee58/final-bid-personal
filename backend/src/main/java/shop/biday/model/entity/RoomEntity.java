package shop.biday.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;


@Getter
@Setter
@Entity
@Builder
@ToString
@Table(name = "rooms")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int person;
    private int price;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dorm_id")
    @JsonBackReference
    private DormEntity dorm;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<BookingEntity> bookings;

    @OneToMany(mappedBy = "room")
    private List<RoomImgEntity> images;
}

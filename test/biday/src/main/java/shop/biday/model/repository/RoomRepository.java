package shop.biday.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import shop.biday.model.entity.RoomEntity;

public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
}

package shop.biday.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import shop.biday.model.entity.DormEntity;

public interface DormRepository extends JpaRepository<DormEntity, Long> {

}

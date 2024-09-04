package shop.biday.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.biday.model.entity.RtagEntity;

public interface RtagRepository extends JpaRepository<RtagEntity, Long> {
}

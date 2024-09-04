package shop.biday.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.biday.model.entity.TagEntity;


public interface TagRepository extends JpaRepository<TagEntity, Long> {
}

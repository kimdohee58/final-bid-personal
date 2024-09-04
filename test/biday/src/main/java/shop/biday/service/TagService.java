package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.RoomModel;
import shop.biday.model.domain.TagModel;
import shop.biday.model.entity.RoomEntity;
import shop.biday.model.entity.TagEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface TagService {
    List<TagEntity> findAll();
    TagEntity save(TagModel tag);
    Optional<TagEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);

}

package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.DormModel;
import shop.biday.model.entity.DormEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface RoomImgService {
    List<DormEntity> findAll();
    DormEntity save(DormModel category);
    Optional<DormEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

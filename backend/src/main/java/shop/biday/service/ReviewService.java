package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.ReviewModel;
import shop.biday.model.domain.RoomModel;
import shop.biday.model.entity.ReviewEntity;
import shop.biday.model.entity.RoomEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface ReviewService {
    List<ReviewEntity> findAll();
    ReviewEntity save(ReviewModel tag);
    Optional<ReviewEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

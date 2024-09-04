package shop.biday.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.entity.ReviewEntity;
import shop.biday.model.domain.ReviewModel;
import shop.biday.model.repository.ReviewRepository;
import shop.biday.service.ReviewService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository ReviewRepository;

    @Override
    public List<ReviewEntity> findAll() {
        return ReviewRepository.findAll();
    }

    @Override
    public ReviewEntity save(ReviewModel entity) {
        return ReviewRepository.save(entity.toEntity());
    }

    @Override
    public Optional<ReviewEntity> findById(Long id) {
        return ReviewRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return ReviewRepository.existsById(id);
    }

    @Override
    public long count() {
        return ReviewRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        ReviewRepository.deleteById(id);
    }
}

package shop.biday.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.domain.DormModel;
import shop.biday.model.entity.DormEntity;
import shop.biday.model.repository.DormRepository;
import shop.biday.service.DormService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DormServiceImpl implements DormService {
    private final DormRepository categoryRepository;

    @Override
    public List<DormEntity> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public DormEntity save(DormModel entity) {
        return categoryRepository.save(entity.toEntity());
    }

    @Override
    public Optional<DormEntity> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return categoryRepository.existsById(id);
    }

    @Override
    public long count() {
        return categoryRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}

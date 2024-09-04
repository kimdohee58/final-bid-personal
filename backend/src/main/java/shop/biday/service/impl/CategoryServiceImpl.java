package shop.biday.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.entity.CategoryEntity;
import shop.biday.model.domain.CategoryModel;
import shop.biday.model.repository.CategoryRepository;
import shop.biday.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity save(CategoryModel entity) {
        return categoryRepository.save(entity.toEntity());
    }

    @Override
    public Optional<CategoryEntity> findById(Long id) {
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

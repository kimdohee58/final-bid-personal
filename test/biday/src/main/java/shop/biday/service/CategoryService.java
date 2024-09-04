package shop.biday.service;

import shop.biday.model.domain.CategoryModel;
import shop.biday.model.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {
    List<CategoryEntity> findAll();
    CategoryEntity save(CategoryModel Category);
    Optional<CategoryEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

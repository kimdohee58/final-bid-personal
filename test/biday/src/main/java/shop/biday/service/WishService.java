package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.WishModel;
import shop.biday.model.entity.WishEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface WishService {
    List<WishEntity> findAll();
    WishEntity save(WishModel category);
    Optional<WishEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

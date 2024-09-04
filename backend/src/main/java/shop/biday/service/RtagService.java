package shop.biday.service;

import shop.biday.model.domain.RtagModel;
import shop.biday.model.entity.RtagEntity;

import java.util.List;
import java.util.Optional;

public interface RtagService {
    List<RtagEntity> findAll();
    RtagEntity save(RtagModel category);
    Optional<RtagEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

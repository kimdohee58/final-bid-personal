package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.AmenityModel;
import shop.biday.model.entity.AmenityEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface AmenityService {
    List<AmenityEntity> findAll();
    AmenityEntity save(AmenityModel category);
    Optional<AmenityEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

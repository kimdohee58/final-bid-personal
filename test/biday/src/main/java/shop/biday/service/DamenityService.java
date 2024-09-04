package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.DamenityModel;
import shop.biday.model.entity.DamenityEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface DamenityService {
    List<DamenityEntity> findAll();
    DamenityEntity save(DamenityModel category);
    Optional<DamenityEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

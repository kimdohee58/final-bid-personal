package shop.biday.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.domain.AmenityModel;
import shop.biday.model.entity.AmenityEntity;
import shop.biday.model.repository.AmenityRepository;
import shop.biday.service.AmenityService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AmenityServiceImpl implements AmenityService {
    private final AmenityRepository amenityRepository;

    @Override
    public List<AmenityEntity> findAll() {
        return amenityRepository.findAll();
    }

    @Override
    public AmenityEntity save(AmenityModel entity) {
        return amenityRepository.save(entity.toEntity());
    }

    @Override
    public Optional<AmenityEntity> findById(Long id) {
        return amenityRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return amenityRepository.existsById(id);
    }

    @Override
    public long count() {
        return amenityRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        amenityRepository.deleteById(id);
    }
}

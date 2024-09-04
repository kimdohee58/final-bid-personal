package shop.biday.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.entity.RoomEntity;
import shop.biday.model.domain.RoomModel;
import shop.biday.model.repository.RoomRepository;
import shop.biday.service.RoomService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    private final RoomRepository RoomRepository;

    @Override
    public List<RoomEntity> findAll() {
        return RoomRepository.findAll();
    }

    @Override
    public RoomEntity save(RoomModel entity) {
        return RoomRepository.save(entity.toEntity());
    }

    @Override
    public Optional<RoomEntity> findById(Long id) {
        return RoomRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return RoomRepository.existsById(id);
    }

    @Override
    public long count() {
        return RoomRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        RoomRepository.deleteById(id);
    }
}

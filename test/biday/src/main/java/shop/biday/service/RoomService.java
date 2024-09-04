package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.RoomModel;
import shop.biday.model.entity.RoomEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface RoomService {
    List<RoomEntity> findAll();
    RoomEntity save(RoomModel category);
    Optional<RoomEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

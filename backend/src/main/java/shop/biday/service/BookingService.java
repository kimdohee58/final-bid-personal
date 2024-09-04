package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.BookingModel;
import shop.biday.model.entity.BookingEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface BookingService {
    List<BookingEntity> findAll();
    BookingEntity save(BookingModel category);
    Optional<BookingEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

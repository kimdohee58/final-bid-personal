package shop.biday.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.domain.BookingModel;
import shop.biday.model.entity.BookingEntity;
import shop.biday.model.repository.BookingRepository;
import shop.biday.service.BookingService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;

    @Override
    public List<BookingEntity> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public BookingEntity save(BookingModel entity) {
        return bookingRepository.save(entity.toEntity());
    }

    @Override
    public Optional<BookingEntity> findById(Long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return bookingRepository.existsById(id);
    }

    @Override
    public long count() {
        return bookingRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        bookingRepository.deleteById(id);
    }
}

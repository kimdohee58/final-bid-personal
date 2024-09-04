package shop.biday.service;

import org.springframework.stereotype.Service;
import shop.biday.model.domain.BookingModel;
import shop.biday.model.domain.PaymentModel;
import shop.biday.model.entity.BookingEntity;
import shop.biday.model.entity.PaymentEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface PaymentService {
    List<PaymentEntity> findAll();
    PaymentEntity save(PaymentModel category);
    Optional<PaymentEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

package shop.biday.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.biday.model.domain.PaymentModel;
import shop.biday.model.entity.PaymentEntity;
import shop.biday.model.repository.PaymentRepository;
import shop.biday.service.PaymentService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public List<PaymentEntity> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public PaymentEntity save(PaymentModel entity) {
        return paymentRepository.save(entity.toEntity());
    }

    @Override
    public Optional<PaymentEntity> findById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return paymentRepository.existsById(id);
    }

    @Override
    public long count() {
        return paymentRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        paymentRepository.deleteById(id);
    }
}

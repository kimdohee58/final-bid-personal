package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.biday.model.domain.PaymentModel;
import shop.biday.model.entity.PaymentEntity;
import shop.biday.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping("/")
    public List<PaymentEntity> findAll() {
        return paymentService.findAll();
    }

    @PostMapping("/save")
    public PaymentEntity save(PaymentModel Payment) {
        return paymentService.save(Payment);
    }

    @GetMapping("/findById/{id}")
    public Optional<PaymentEntity> findById(@PathVariable Long id) {
        return paymentService.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return paymentService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return paymentService.count();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        paymentService.deleteById(id);
    }
}

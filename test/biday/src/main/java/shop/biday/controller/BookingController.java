package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.biday.model.domain.BookingModel;
import shop.biday.model.entity.BookingEntity;
import shop.biday.service.BookingService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/")
    public List<BookingEntity> findAll() {
        return bookingService.findAll();
    }

    @PostMapping("/save")
    public BookingEntity save(BookingModel Booking) {
        return bookingService.save(Booking);
    }

    @GetMapping("/findById/{id}")
    public Optional<BookingEntity> findById(@PathVariable Long id) {
        return bookingService.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return bookingService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return bookingService.count();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        bookingService.deleteById(id);
    }
}

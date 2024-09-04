package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.biday.model.domain.ReviewModel;
import shop.biday.model.entity.ReviewEntity;
import shop.biday.service.ReviewService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("/")
    public List<ReviewEntity> findAll() {
        return reviewService.findAll();
    }

    @PostMapping("/save")
    public ReviewEntity save(ReviewModel Review) {
        return reviewService.save(Review);
    }

    @GetMapping("/findById/{id}")
    public Optional<ReviewEntity> findById(@PathVariable Long id) {
        return reviewService.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return reviewService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return reviewService.count();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        reviewService.deleteById(id);
    }
}

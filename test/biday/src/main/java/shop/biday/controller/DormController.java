package shop.biday.controller;

import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.biday.model.domain.DormModel;
import shop.biday.model.entity.DormEntity;
import shop.biday.service.DormService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/dorms")
public class DormController {
    private final DormService dormService;

    @GetMapping("/")
    public List<DormEntity> findAll() {
        return dormService.findAll();
    }

    @PostMapping("/save")
    public DormEntity save(DormModel Dorm) {
        return dormService.save(Dorm);
    }

    @GetMapping("/findById/{id}")
    public Optional<DormEntity> findById(@PathVariable Long id) {
        return dormService.findById(id);
    }

    @GetMapping("/existById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return dormService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return dormService.count();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        dormService.deleteById(id);
    }
}

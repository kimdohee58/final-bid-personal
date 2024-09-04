package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.biday.model.domain.CategoryModel;
import shop.biday.model.entity.CategoryEntity;
import shop.biday.model.repository.CategoryRepository;
import shop.biday.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/categories") // uri
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryRepository categoryRepository;

    @GetMapping("/")
    public List<CategoryEntity> findAll() {
        return categoryService.findAll();
    }

    @PostMapping("/save")
    public CategoryEntity save(@RequestBody CategoryModel Category) {
        System.out.println(Category);
        return categoryService.save(Category);
    }

    @GetMapping("/findById/{id}")
    public Optional<CategoryEntity> findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return categoryService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return categoryService.count();
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        categoryService.deleteById(id);
    }
}

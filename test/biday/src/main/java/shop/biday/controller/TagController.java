package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.biday.model.domain.TagModel;
import shop.biday.model.entity.TagEntity;
import shop.biday.service.TagService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/tags")
public class TagController {
    private final TagService tagService;

    @GetMapping("/")
    public List<TagEntity> findAll() {
        return tagService.findAll();
    }

    @PostMapping("/save")
    public TagEntity save(TagModel Tag) {
        return tagService.save(Tag);
    }

    @GetMapping("/findById/{id}")
    public Optional<TagEntity> findById(@PathVariable Long id) {
        return tagService.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return tagService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return tagService.count();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        tagService.deleteById(id);
    }
}

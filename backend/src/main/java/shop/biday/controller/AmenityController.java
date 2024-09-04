package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.biday.model.domain.AmenityModel;
import shop.biday.model.entity.AmenityEntity;
import shop.biday.service.AmenityService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/amenities")
public class AmenityController {
    private final AmenityService amenityService;

    @GetMapping("/")
    public List<AmenityEntity> findAll() {
        return amenityService.findAll();
    }

    @PostMapping("/save")
    public AmenityEntity save(AmenityModel Amenity) {
        return amenityService.save(Amenity);
    }

    @GetMapping("/findById/{id}")
    public Optional<AmenityEntity> findById(@PathVariable Long id) {
        return amenityService.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return amenityService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return amenityService.count();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        amenityService.deleteById(id);
    }
}

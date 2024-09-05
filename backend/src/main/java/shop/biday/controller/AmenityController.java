package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.biday.model.domain.AmenityModel;
import shop.biday.model.entity.AmenityEntity;
import shop.biday.service.AmenityService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000") // 또는 '*'로 모든 도메인 허용
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
    public AmenityEntity save(@RequestBody AmenityModel Amenity) {
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

    @PutMapping("/updateById")
    public ResponseEntity<?> updateById(@RequestBody AmenityModel amenity) {
        try {
            amenityService.update(amenity);
            return ResponseEntity.ok(new SuccessResponse("Update successful"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse("Failed to update amenity"));
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        try {
            amenityService.deleteById(id);
            return ResponseEntity.ok(new SuccessResponse("Deletion successful"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse("Failed to delete amenity"));
        }
    }

    // 예외 응답을 위한 내부 클래스 정의
    public static class ErrorResponse {
        private String message;

        public ErrorResponse(String message) {
            this.message = message;
        }

        // Getter 및 Setter
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class SuccessResponse {
        private String message;

        public SuccessResponse(String message) {
            this.message = message;
        }

        // Getter 및 Setter
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}

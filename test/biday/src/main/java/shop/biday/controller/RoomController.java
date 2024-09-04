package shop.biday.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shop.biday.model.domain.RoomModel;
import shop.biday.model.entity.RoomEntity;
import shop.biday.service.RoomService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    @GetMapping("/")
    public List<RoomEntity> findAll() {
        return roomService.findAll();
    }

    @PostMapping("/save")
    public RoomEntity save(RoomModel Room) {
        return roomService.save(Room);
    }

    @GetMapping("/findById/{id}")
    public Optional<RoomEntity> findById(@PathVariable Long id) {
        return roomService.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable Long id) {
        return roomService.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return roomService.count();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        roomService.deleteById(id);
    }
}

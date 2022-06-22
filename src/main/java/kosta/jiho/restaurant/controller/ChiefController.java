package kosta.jiho.restaurant.controller;

import kosta.jiho.restaurant.domain.Chief;
import kosta.jiho.restaurant.dto.ChiefDTO;
import kosta.jiho.restaurant.mapper.ChiefMapper;
import kosta.jiho.restaurant.service.ChiefService;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/chiefs")
public class ChiefController {
    private final ChiefService service;

    public ChiefController(ChiefService service) {
        this.service = service;
    }

    @GetMapping
    public List<Chief> getChiefs() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Chief getChief(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Chief registerChief(@RequestBody Chief chief) {
        return service.save(chief);
    }

    @PutMapping("/{id}")
    public Chief updateChief(@PathVariable("id") Long id, @Valid @RequestBody ChiefDTO payload) {
        Chief chief = service.findById(id);
        ChiefMapper mapper = Mappers.getMapper(ChiefMapper.class);
        mapper.updateRequestToChief(payload, chief);
        return service.save(chief);
    }

    @DeleteMapping("/{id}")
    public void deleteChief(@PathVariable("id") Long id) {
        service.delete(id);
    }
}

package kosta.jiho.restaurant.controller;

import kosta.jiho.restaurant.domain.Chief;
import kosta.jiho.restaurant.domain.Dish;
import kosta.jiho.restaurant.dto.ChiefDTO;
import kosta.jiho.restaurant.dto.DishDTO;
import kosta.jiho.restaurant.mapper.ChiefMapper;
import kosta.jiho.restaurant.mapper.DishMapper;
import kosta.jiho.restaurant.service.DishService;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/chiefs")
public class DishController {
    private final DishService service;

    public DishController(DishService service) {
        this.service = service;
    }

    @GetMapping
    public List<Dish> getChiefs() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Dish getChief(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Dish registerChief(@RequestBody Dish dish) {
        return service.save(dish);
    }

    @PutMapping("/{id}")
    public Dish updateDish(@PathVariable("id") Long id, @Valid @RequestBody DishDTO payload) {
        Dish dish = service.findById(id);
        DishMapper mapper = Mappers.getMapper(DishMapper.class);
        mapper.updateRequestToDish(payload, dish);
        return service.save(dish);
    }

    @DeleteMapping("/{id}")
    public void deleteDish(@PathVariable("id") Long id) {
        service.delete(id);
    }
}

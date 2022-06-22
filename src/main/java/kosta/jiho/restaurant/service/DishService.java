package kosta.jiho.restaurant.service;

import kosta.jiho.restaurant.domain.Dish;
import kosta.jiho.restaurant.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    private final DishRepository repository;

    public DishService(DishRepository repository) {
        this.repository = repository;
    }

    public List<Dish> findAll() {
        return repository.findAll();
    }
    public Dish findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
    public Dish save(Dish dish) {
        return repository.save(dish);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

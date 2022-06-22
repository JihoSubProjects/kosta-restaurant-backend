package kosta.jiho.restaurant.service;

import kosta.jiho.restaurant.domain.Chief;
import kosta.jiho.restaurant.repository.ChiefRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChiefService {
    private final ChiefRepository repository;

    public ChiefService(ChiefRepository repository) {
        this.repository = repository;
    }

    public List<Chief> findAll() {
        return repository.findAll();
    }
    public Chief findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
    public Chief save(Chief chief) {
        return repository.save(chief);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }

}

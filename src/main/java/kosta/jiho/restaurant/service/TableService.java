package kosta.jiho.restaurant.service;

import kosta.jiho.restaurant.domain.Table;
import kosta.jiho.restaurant.repository.TableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    private final TableRepository repository;

    public TableService(TableRepository repository) {
        this.repository = repository;
    }

    public List<Table> findAll() {
        return repository.findAll();
    }
    public Table findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
    public Table save(Table table) {
        return repository.save(table);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

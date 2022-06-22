package kosta.jiho.restaurant.service;

import kosta.jiho.restaurant.domain.OrderDetail;
import kosta.jiho.restaurant.repository.OrderDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    private final OrderDetailRepository repository;

    public OrderDetailService(OrderDetailRepository repository) {
        this.repository = repository;
    }

    public List<OrderDetail> findAll() {
        return repository.findAll();
    }
    public OrderDetail findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
    public OrderDetail save(OrderDetail orderDetail) {
        return repository.save(orderDetail);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

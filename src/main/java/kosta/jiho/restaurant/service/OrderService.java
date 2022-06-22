package kosta.jiho.restaurant.service;

import kosta.jiho.restaurant.domain.Order;
import kosta.jiho.restaurant.repository.OrderDetailRepository;
import kosta.jiho.restaurant.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;

    public OrderService(OrderRepository orderRepository, OrderDetailRepository orderDetailRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailRepository = orderDetailRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }
    public Order save(Order order) {
        return orderRepository.save(order);
    }
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

}

package service;

import model.Order;
import repository.OrderRepository;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.UUID;

public class OrderService extends BaseService<Order, OrderRepository> {
    public static final OrderService orderService = new OrderService();
    public static OrderService getInstance(){
        return orderService;
    }
    public OrderService() {
        super(OrderRepository.getInstance());
    }


    public ArrayList<Order> getAllUserOrder(UUID userId) {
        return repository.getAllUserOrder(userId);
    }
}

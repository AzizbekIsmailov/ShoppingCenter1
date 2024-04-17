package repository;

import model.Order;

import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class OrderRepository extends BaseRepository<Order> {
    private static  OrderRepository orderRepository = new OrderRepository();

    public static OrderRepository getInstance() {
        if(Objects.isNull(orderRepository)){
            orderRepository = new OrderRepository();
        }
        return orderRepository;
    }
    private OrderRepository(){
    }

    public ArrayList<Order> getAllUserOrder(UUID userId) {
        ArrayList<Order> orders = new ArrayList<>();
        for (Order order : data) {
            if (order.getId().equals(userId)) {
                orders.add(order);
            }
        }
        return orders;
    }

}

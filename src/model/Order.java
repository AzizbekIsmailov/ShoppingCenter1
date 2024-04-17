package model;

import java.util.UUID;

public class Order extends BaseModel{
    private UUID userId;
    private UUID productId;
    private double price;
    private int amount;

    public Order(UUID userId, UUID productId, double price, int amount) {
        this.userId = userId;
        this.productId = productId;
        this.price = price;
        this.amount = amount;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}

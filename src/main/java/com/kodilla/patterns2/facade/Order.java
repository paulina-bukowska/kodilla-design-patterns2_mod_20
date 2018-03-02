package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private ProductService productService;

    private final List<Item> items = new ArrayList<>();

    private Long orderId;

    private Long userId;

    private Boolean isPaid = false;

    private Boolean isVerified = false;

    private Boolean isSubmitted = false;

    public Order(ProductService productService, Long orderId, Long userId) {
        this.productService = productService;
        this.orderId = orderId;
        this.userId = userId;
    }

    public BigDecimal calculateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item : items) {
            sum = sum.add(productService.getPrice(item.getProductId()))
                    .multiply(new BigDecimal(item.getQty()));
        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public Boolean getSubmitted() {
        return isSubmitted;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public void setSubmitted(Boolean submitted) {
        isSubmitted = submitted;
    }
}

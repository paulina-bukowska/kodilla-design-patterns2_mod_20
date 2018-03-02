package com.kodilla.patterns2.facade;

public class Item {
    private Long productId;
    private Double qty;

    public Item(Long productId, Double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public Double getQty() {
        return qty;
    }
}

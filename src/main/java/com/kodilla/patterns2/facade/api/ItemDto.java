package com.kodilla.patterns2.facade.api;

public class ItemDto {
    private Long productId;
    private Double qty;

    public ItemDto(Long productId, Double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public Double getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "productId=" + productId +
                ", qty=" + qty +
                '}';
    }
}

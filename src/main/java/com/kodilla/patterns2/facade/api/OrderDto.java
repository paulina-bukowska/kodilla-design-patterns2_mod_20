package com.kodilla.patterns2.facade.api;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private final List<ItemDto> items = new ArrayList<>();

    public OrderDto() {
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void addItem(final ItemDto itemDto) {
        items.add(itemDto);
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "items=" + items +
                '}';
    }
}

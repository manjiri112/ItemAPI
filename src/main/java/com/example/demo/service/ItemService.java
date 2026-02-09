package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Item;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();

    public Item addItem(Item item) {
        items.add(item);
        return item;
    }

    public Item getItemById(int id) {
        return items.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

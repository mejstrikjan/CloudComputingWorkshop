package com.example.cloud.main.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

import com.example.cloud.main.service.ItemService;
import com.example.cloud.main.model.Item;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping
    public Map<String, String> list() {
        return service.getAll();
    }

    @PostMapping
    public String create(@RequestBody Map<String, String> payload) {
        return service.create(payload.get("name"));
    }

    @GetMapping("/{id}")
    public String get(@PathVariable String id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody Map<String, String> payload) {
        service.update(id, payload.get("name"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}

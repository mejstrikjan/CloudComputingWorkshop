package main.java.com.example.cloud.service;

import com.example.cloud.model.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private final Map<String, Item> store = new HashMap<>();

    public List<Item> getAll() {
        return new ArrayList<>(store.values());
    }

    public Item create(String name) {
        String id = UUID.randomUUID().toString();
        Item item = new Item(id, name);
        store.put(id, item);
        return item;
    }

    public Item get(String id) {
        return store.get(id);
    }

    public Item update(String id, String name) {
        Item item = store.get(id);
        if (item == null) return null;
        item.setName(name);
        return item;
    }

    public boolean delete(String id) {
        return store.remove(id) != null;
    }
}

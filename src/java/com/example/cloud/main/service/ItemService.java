package com.example.cloud.main.service;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private final RedisTemplate<String, String> redisTemplate;
    private final HashOperations<String, String, String> hashOps;
    private final String KEY = "ITEMS";

    public ItemService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOps = redisTemplate.opsForHash();
    }

    public Map<String, String> getAll() {
        return hashOps.entries(KEY);
    }

    public String create(String name) {
        String id = UUID.randomUUID().toString();
        hashOps.put(KEY, id, name);
        return id;
    }

    public String get(String id) {
        return hashOps.get(KEY, id);
    }

    public void update(String id, String name) {
        hashOps.put(KEY, id, name);
    }

    public void delete(String id) {
        hashOps.delete(KEY, id);
    }
}

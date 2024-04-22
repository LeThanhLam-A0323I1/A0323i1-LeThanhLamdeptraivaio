package com.example.baitap2tudien.repository;


import com.example.baitap2tudien.model.TuDien;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TuDienRepository implements ITuDienRepository{
    private static final Map<Integer, TuDien> list = new HashMap<>();
    static {
        list.put(1, new TuDien("ẹnjoy", "tận hưởng"));
        list.put(2, new TuDien("phone number", "số điện thoại"));
        list.put(3, new TuDien("apple", "quả táo"));
        list.put(4, new TuDien("table", "bảng"));
    }
    @Override
    public List<TuDien> findAll() {
        return new ArrayList<>(list.values());
    }
}

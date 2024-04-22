package com.example.baitap2tudien.service;

import com.example.baitap2tudien.model.TuDien;
import com.example.baitap2tudien.repository.ITuDienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TuDienService implements ITuDienService{
    @Autowired
    private ITuDienRepository iTuDienRepository;

    @Override
    public List<TuDien> findAll() {
        return iTuDienRepository.findAll();
    }
}

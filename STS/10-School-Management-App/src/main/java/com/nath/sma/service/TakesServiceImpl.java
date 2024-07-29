package com.nath.sma.service;

import org.springframework.stereotype.Service;

import com.nath.sma.entity.Takes;
import com.nath.sma.repository.TakesRepository;

@Service
public class TakesServiceImpl implements TakesService {
    private TakesRepository takesRepository;


    @Override
    public Iterable<Takes> listAllTakes() {
        return takesRepository.findAll();
    }

    @Override
    public void saveTakes(Takes takes) {
        
        takesRepository.save(takes);
    }

    @Override
    public Takes findById(long id) {
        return takesRepository.findById(id);
    }

    @Override
    public void deleteTakes(Takes takes) {
        takesRepository.delete(takes);
        
    }
    
}

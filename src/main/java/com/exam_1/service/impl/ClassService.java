package com.exam_1.service.impl;

import com.exam_1.model.Class;
import com.exam_1.repository.IClassRepository;
import com.exam_1.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClassService implements IClassService {
    @Autowired
    private IClassRepository iClassRepository;
    @Override
    public Iterable<Class> findAll() {
        return iClassRepository.findAll();
    }

    @Override
    public Optional<Class> findById(Long id) {
        return iClassRepository.findById(id);
    }

    @Override
    public void save(Class value) {
        iClassRepository.save(value);
    }

    @Override
    public void delete(Class value) {
        iClassRepository.save(value);
    }
}

package com.exam_1.service.impl;

import com.exam_1.model.Student;
import com.exam_1.repository.IStudentRepository;
import com.exam_1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public Iterable<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public void save(Student value) {
        iStudentRepository.save(value);
    }

    @Override
    public void delete(Student value) {
        iStudentRepository.delete(value);
    }


}

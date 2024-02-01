package com.exam_1.service;

import java.util.Optional;

public interface IGenerate<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T value);
    void delete(T value);
}

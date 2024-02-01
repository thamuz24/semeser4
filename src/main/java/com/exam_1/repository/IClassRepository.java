package com.exam_1.repository;

import com.exam_1.model.Class;
import org.springframework.data.repository.CrudRepository;

public interface IClassRepository extends CrudRepository<Class,Long> {
}

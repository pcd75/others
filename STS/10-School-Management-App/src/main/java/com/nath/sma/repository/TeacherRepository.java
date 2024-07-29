package com.nath.sma.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nath.sma.entity.Teachers;

@Repository
public interface TeacherRepository extends CrudRepository<Teachers, Long> {
    Teachers findById(long id);
}

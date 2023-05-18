package com.selfLearning.springBootCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.selfLearning.springBootCrud.entity.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,String> {

}

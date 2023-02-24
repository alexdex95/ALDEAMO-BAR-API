package com.aldeamo.bar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aldeamo.bar.model.entity.ArraysObject;

@Repository
public interface ArraysRepository extends CrudRepository<ArraysObject, String> {

}
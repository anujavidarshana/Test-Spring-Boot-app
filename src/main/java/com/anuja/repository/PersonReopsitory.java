package com.anuja.repository;

import org.springframework.data.repository.CrudRepository;

import com.anuja.model.PersonEntity;

public interface PersonReopsitory extends CrudRepository<PersonEntity, Long> {

}

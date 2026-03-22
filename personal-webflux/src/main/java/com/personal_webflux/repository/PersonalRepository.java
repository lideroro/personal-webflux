package com.personal_webflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.personal_webflux.entity.Personal;

@Repository
public interface PersonalRepository extends ReactiveCrudRepository<Personal, Integer>  {

}

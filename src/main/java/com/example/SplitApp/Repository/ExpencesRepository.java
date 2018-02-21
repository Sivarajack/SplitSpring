package com.example.SplitApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SplitApp.Entity.Expences;
@Repository
public interface ExpencesRepository extends CrudRepository<Expences, Integer> {

}

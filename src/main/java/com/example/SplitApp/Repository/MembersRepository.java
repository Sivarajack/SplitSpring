package com.example.SplitApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SplitApp.Entity.Members;
@Repository
public interface MembersRepository extends CrudRepository<Members, Integer> {

}

package com.example.SplitApp.Repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SplitApp.Entity.Groups;
@Repository
public interface GroupsRepository extends CrudRepository<Groups,Integer> {
	List<Groups> findAll();
}

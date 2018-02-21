package com.example.SplitApp.resource;
import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SplitApp.Entity.Groups;
import com.example.SplitApp.Repository.GroupsRepository;
@RestController



public class GroupsResource {
	@Autowired
	private GroupsRepository groupsRepository;
	@GET
	@RequestMapping("/groups")
	public List<Groups> addGroup() {
		
		groupsRepository.save(new Groups(3,"SoupBoys"));
		System.out.println(groupsRepository.findAll());
		return groupsRepository.findAll();
	}
	

}

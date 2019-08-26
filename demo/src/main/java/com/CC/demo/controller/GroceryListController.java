package com.CC.demo.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.CC.demo.models.GroceryList;
import com.CC.demo.service.GroceryListService;


@RestController
@RequestMapping("/list")
public class GroceryListController {
		
//	GET /grocery-lists to find all grocery lists
//	POST /grocery-lists to create a new grocery list
//	DELETE /grocery-lists/items/{itemId} to remove an item from a grocery list
//	DELETE /grocery-lists to delete a grocery list
	
//	POST /grocery-lists/items to add a new item to a grocery list
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public GroceryList registerGroceryItem(@RequestBody GroceryList list) {
		if (GroceryListService.addGroceryItem(list) == null)
			return list;
		return list;
	}
	

//	DELETE /grocery-lists to delete a grocery list
	@DeleteMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Boolean deleteById(@PathVariable String id) {
		GroceryList groceryListID = GroceryListService.findById(id);
		return GroceryListService.deleteById(id);
	}


	
//	//	GET /grocery-lists to find all grocery lists
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public List<GroceryList> getAllUsers() {
			return GroceryListService.findAllGroceryLists();
		}

	
//	POST /grocery-lists to create a new grocery list
		@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.CREATED)
		public GroceryList registerGroceryList(@RequestBody GroceryList list) {
			if (GroceryListService.addGroceryItem(list) == null)
			return list;
			return list;
		}

		
		
//		DELETE /grocery-lists/items/{itemId} to remove an item from a grocery list
		@DeleteMapping(value = "/id/{id}")
		@ResponseStatus(HttpStatus.OK)
		public void deleteUser(@PathVariable int id) {
			GroceryList list = GroceryListService.findById(id);
			if (!GroceryListService.deleteGrocerItemById(list.getGroceryListID()));
			
			}

		
}

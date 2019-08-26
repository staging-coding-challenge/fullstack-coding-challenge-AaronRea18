package com.CC.demo.data;

import org.springframework.data.repository.CrudRepository;

import com.CC.demo.models.GroceryItems;
import com.CC.demo.models.GroceryList;

public interface GroceryListDAO extends CrudRepository<GroceryList, Object>{

}

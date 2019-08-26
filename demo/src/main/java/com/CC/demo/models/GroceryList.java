package com.CC.demo.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table
@Component
public class GroceryList {

	@Id
	@GeneratedValue
	@Column
	int GroceryListID;
	
	@Column
	String Name;

	public int getGroceryListID() {
		return GroceryListID;
	}

	public void setGroceryListID(int groceryListID) {
		GroceryListID = groceryListID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + GroceryListID;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (GroceryListID != other.GroceryListID)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryList [GroceryListID=" + GroceryListID + ", Name=" + Name + "]";
	}

	public GroceryList(int groceryListID, String name) {
		super();
		GroceryListID = groceryListID;
		Name = name;
	}

	public GroceryList() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

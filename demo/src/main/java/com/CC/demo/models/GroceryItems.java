package com.CC.demo.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;




@Table
@Component
public class GroceryItems {

	@Id
	@Column
	@GeneratedValue
	int groceryItemsID; 
	
	@Column
	String itemName;
	
	@Column
	String type;
	
	  @ManyToOne
	  @Column
	  GroceryList groceryListID;

	public int getGroceryItemsID() {
		return groceryItemsID;
	}

	public void setGroceryItemsID(int groceryItemsID) {
		this.groceryItemsID = groceryItemsID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GroceryList getGroceryListID() {
		return groceryListID;
	}

	public void setGroceryListID(GroceryList groceryListID) {
		this.groceryListID = groceryListID;
	}

	@Override
	public String toString() {
		return "GroceryItems [groceryItemsID=" + groceryItemsID + ", itemName=" + itemName + ", type=" + type
				+ ", groceryListID=" + groceryListID + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groceryItemsID;
		result = prime * result + ((groceryListID == null) ? 0 : groceryListID.hashCode());
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		GroceryItems other = (GroceryItems) obj;
		if (groceryItemsID != other.groceryItemsID)
			return false;
		if (groceryListID == null) {
			if (other.groceryListID != null)
				return false;
		} else if (!groceryListID.equals(other.groceryListID))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public GroceryItems(int groceryItemsID, String itemName, String type, GroceryList groceryListID) {
		super();
		this.groceryItemsID = groceryItemsID;
		this.itemName = itemName;
		this.type = type;
		this.groceryListID = groceryListID;
	}

	public GroceryItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

package com.example.service;
import com.example.entity.Item;
import java.util.List;

public interface ItemService {
	
	Item createItem(Item item);
	
	List<Item>getAllItem();

	String deleteItem(int id);

	Item showItem(int id);

	   Item update(int id,Item item);

	
	
}

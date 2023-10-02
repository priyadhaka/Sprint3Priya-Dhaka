package com.example.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.entity.Item;
import com.example.service.ItemService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/postitem")
	public Item createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
	@GetMapping("/getAllItem")
	List<Item>getAllItem()
	{
		return itemService.getAllItem();
		
}
	
	@PutMapping("update/{id}")
	public	Item NewProduct(@PathVariable int id, @RequestBody Item i)
	{
		
	 return itemService.update(id, i);
		
	
	}
	
	
	@DeleteMapping("delete/{id}")
	public	String deleteNewProduct(@PathVariable int id)
	{
		
		 return itemService.deleteItem(id);
		
	}

	

		
	}



package com.example.serviceimpl;

import com.example.service.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Item;
import com.example.repository.ItemRepo;
import com.example.service.ItemService;

@Service
public class ItemServiceImpl  implements ItemService{
	
	@Autowired
	ItemRepo itemRepo;

	
	
	
	@Override
	public Item createItem(Item item) {
		return itemRepo.save(item);  
	}




	@Override
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}




	@Override
	public String deleteItem(int id) {
		// TODO Auto-generated method stub
		itemRepo.deleteById(id);
		return "item deleted successfully";
	}




	@Override
	public Item showItem(int id) {
		// TODO Auto-generated method stub
		return itemRepo.findById(id).orElse(null);
	}




	@Override
	public Item update(int id, Item item) {
		// TODO Auto-generated method stub
		Item i = itemRepo.findById(id).get();
		i.setName(item.getName());
		i.setDescription(item.getDescription());
		i.setPrice(item.getPrice());
		Item i1= itemRepo.save(i); 
		return i1;
	}




	
	
	

}

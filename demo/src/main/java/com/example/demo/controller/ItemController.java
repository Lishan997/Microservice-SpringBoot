package com.example.demo.controller;

import com.example.demo.dto.ItemDto;
import com.example.demo.service.ItemService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/")

public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<ItemDto> items(){
        return itemService.getAllItems();
    }

    @GetMapping("/items/{id}")
    public ItemDto items(@PathVariable int id){
        return itemService.getItemById(id);
    }
}

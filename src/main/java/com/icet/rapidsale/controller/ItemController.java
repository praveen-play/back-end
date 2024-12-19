package com.icet.rapidsale.controller;

import com.icet.rapidsale.dto.ItemDto;
import com.icet.rapidsale.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/item")
    ResponseEntity<ItemDto> saveItem(@RequestBody ItemDto dto){
        dto.setUpdatedDate(LocalDateTime.now());
        try {
           return itemService.saveItem(dto) == null ? ResponseEntity.status(404).body(null) : ResponseEntity.status(200).body(itemService.saveItem(dto));
        }catch (Exception e){
            System.out.println("my error "+e.getMessage());
            return null;
        }
    }

    @PutMapping("/item")
    ResponseEntity<ItemDto> updateItem(@RequestBody ItemDto dto){
        return itemService.updateItem(dto)==null?ResponseEntity.status(404).body(null):ResponseEntity.status(200).body(itemService.updateItem(dto));
    }

    @DeleteMapping("/item/{itemCode}")
    void deleteItem(@PathVariable Integer itemCode){
        itemService.deleteItem(itemCode);
    }

    @GetMapping("/item")
    ResponseEntity<List<ItemDto>> getAllItems(){
        return itemService.getAllItems()==null?ResponseEntity.status(404).body(null):ResponseEntity.status(200).body(itemService.getAllItems());
    }

    @GetMapping("/itemByItemCode/{itemCode}")
    ResponseEntity<ItemDto> getItemByItemCode(@PathVariable Integer itemCode){
        ItemDto dto=itemService.findItemByItemCode(itemCode);
        return dto==null?ResponseEntity.status(404).body(null):ResponseEntity.status(200).body(dto);
    }

    @GetMapping("/itemByItemName/{name}")
    ResponseEntity<ItemDto> getItemByItemName(@PathVariable String name){
        ItemDto dto=itemService.findItemByName(name);
        return dto==null?ResponseEntity.status(404).body(null):ResponseEntity.status(200).body(dto);
    }

    @GetMapping("/itemByBarcode/{barcode}")
    ResponseEntity<ItemDto> getItemByBarcode(@PathVariable String barcode){
        ItemDto dto=itemService.findItemByBarcode(barcode);
        return dto==null?ResponseEntity.status(404).body(null):ResponseEntity.status(200).body(dto);
    }


}
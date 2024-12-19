package com.icet.rapidsale.service;

import com.icet.rapidsale.dto.ItemDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    ItemDto saveItem(ItemDto dto);
    ItemDto updateItem(ItemDto dto);
    void deleteItem(int id);
    List<ItemDto> getAllItems();
    ItemDto findItemByItemCode(int itemCode);
    ItemDto findItemByName(String name);
    ItemDto findItemByBarcode(String barcode);
}

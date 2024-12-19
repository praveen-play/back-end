package com.icet.rapidsale.repository;

import com.icet.rapidsale.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
    Item findItemByName(String name);
    Item findItemByBarcode(String barcode);
}

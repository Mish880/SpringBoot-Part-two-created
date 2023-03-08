package lk.project.spring.service;

import lk.project.spring.dto.ItemDto;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDto dto);

    void deleteItem(String id);

    void updateItem(ItemDto dto);

    ItemDto serarchItem(String id);

    List<ItemDto> getAllItem();
}

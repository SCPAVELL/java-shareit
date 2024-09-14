package ru.practicum.shareit.item.storage;

import ru.practicum.shareit.common.storage.CommonStorage;
import ru.practicum.shareit.item.comment.model.Item;

import java.util.List;

@Deprecated
public interface ItemStorage extends CommonStorage<Item> {
	List<Item> findAll(Long userId);

	List<Item> searchItems(String text);
}
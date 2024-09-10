package ru.practicum.shareit.item.service;

import ru.practicum.shareit.item.ItemDto;
import ru.practicum.shareit.item.comment.dto.CommentDto;

import java.util.List;

public interface ItemService {

	ItemDto create(ItemDto itemDto, Long userId);

	ItemDto update(ItemDto itemDto, Long itemId, Long userId);

	ItemDto getItemById(Long itemId, Long userId);

	List<ItemDto> getAllUserItems(Long id);

	List<ItemDto> searchItem(String text);

	CommentDto postComment(CommentDto commentDto, Long itemId, Long userId);
}
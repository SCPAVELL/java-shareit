package ru.practicum.shareit.item.service;

import java.util.List;

import ru.practicum.shareit.item.comment.dto.CommentDto;
import ru.practicum.shareit.item.dto.ItemDto;

public interface ItemService {

	ItemDto create(ItemDto itemDto, Long userId);

	ItemDto update(ItemDto itemDto, Long itemId, Long userId);

	ItemDto getItemById(Long itemId, Long userId);

	List<ItemDto> getAllUserItems(Long id);

	List<ItemDto> searchItem(String text);

	CommentDto postComment(CommentDto commentDto, Long itemId, Long userId);
}
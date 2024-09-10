package ru.practicum.shareit.item.mapper;

import java.time.LocalDateTime;

import ru.practicum.shareit.item.comment.model.Comment;
import ru.practicum.shareit.item.dto.CommentDto;
import ru.practicum.shareit.item.dto.CommentSaveDto;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.user.dto.UserDto;
import ru.practicum.shareit.user.mapper.UserMapper;

public class CommentMapper {
	public static CommentDto toCommentDto(Comment comment) {
		return new CommentDto(comment.getId(), comment.getText(), comment.getItem().getId(),
				comment.getAuthor().getName(), comment.getCreated());
	}

	public static Comment toComment(CommentDto commentDto, UserDto userDto, ItemDto itemDto) {
		return new Comment(commentDto.getId(), commentDto.getText(), ItemMapper.toItem(itemDto),
				UserMapper.toUser(userDto), commentDto.getCreated());
	}

	public static Comment toComment(CommentSaveDto commentDto, UserDto userDto, ItemDto itemDto) {
		return new Comment(null, commentDto.getText(), ItemMapper.toItem(itemDto), UserMapper.toUser(userDto),
				LocalDateTime.now());
	}
}
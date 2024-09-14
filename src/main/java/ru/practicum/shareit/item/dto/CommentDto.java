package ru.practicum.shareit.item.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class CommentDto {
	private Long id;
	private String text;
	private Long itemId;
	private String authorName;
	private LocalDateTime created;
}
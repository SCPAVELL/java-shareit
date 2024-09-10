package ru.practicum.shareit.item.comment.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CommentSaveDto {
	@NotEmpty
	private String text;
}
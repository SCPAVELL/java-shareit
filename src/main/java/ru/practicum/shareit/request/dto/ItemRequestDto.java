package ru.practicum.shareit.request.dto;

import lombok.Builder;
import ru.practicum.shareit.user.dto.UserDto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * TODO Sprint add-item-requests.
 */
@Builder
public class ItemRequestDto {
	private Long id;
	@NotNull(message = "Текст запроса не может быть null")
	@NotBlank(message = "Текст запроса не может быть пустым")
	private String description;
	@NotNull(message = "Пользователь, создающий запрос должен существовать")
	private UserDto requester;
	private LocalDateTime created;
}

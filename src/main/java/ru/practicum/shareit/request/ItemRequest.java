package ru.practicum.shareit.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.user.User;
import java.time.LocalDateTime;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * TODO Sprint add-item-requests.
 */
@Getter
@Setter
@Builder
public class ItemRequest {
	private Long id;
	@NotNull(message = "Текст запроса не может быть null")
	@NotBlank(message = "Текст запроса не может быть пустым")
	private String description;
	@NotNull(message = "Пользователь, создающий запрос должен существовать")
	private User requester;
	private LocalDateTime created;
}

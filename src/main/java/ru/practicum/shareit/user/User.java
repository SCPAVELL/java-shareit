package ru.practicum.shareit.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * TODO Sprint add-controllers.
 */
@Getter
@Setter
@Builder
public class User {
	private Long id;
	@NotNull(message = "Имя не может быть null")
	@NotBlank(message = "Имя не может быть пустым")
	private String name;
	@Email
	private String email;
}

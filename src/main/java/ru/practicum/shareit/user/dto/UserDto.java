package ru.practicum.shareit.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.practicum.shareit.item.storage.OnCreate;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class UserDto {
	private Long id;

	@NotBlank(message = "Имя пользователя не может быть пустым", groups = OnCreate.class)
	private String name;

	@NotNull(groups = OnCreate.class)
	@Email(message = "Указан некорректный Email")
	private String email;

}
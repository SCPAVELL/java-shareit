package ru.practicum.shareit.item.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.practicum.shareit.item.storage.OnCreate;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class ItemDto {

	private Long id;

	@NotBlank(groups = OnCreate.class, message = "Название предмета не может быть пустым")
	private String name;

	@NotBlank(groups = OnCreate.class, message = "Описание не может быть пустым")
	private String description;

	@NotNull(groups = OnCreate.class, message = "Доступность предмета не может быт null")
	private Boolean available;

	private Long ownerId;

	private Long requestId;

}
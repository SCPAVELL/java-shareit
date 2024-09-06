package ru.practicum.shareit.item.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.practicum.shareit.request.ItemRequest;
import ru.practicum.shareit.user.User;

/**
 * TODO Sprint add-controllers.
 */
@ToString
@Getter
@Setter
@Builder
public class Item {
	private Long id;
	private String name;
	private String description;
	private User owner;
	private Boolean available;
	private ItemRequest request;
}

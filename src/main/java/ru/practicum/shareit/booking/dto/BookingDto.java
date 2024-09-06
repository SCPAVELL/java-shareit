package ru.practicum.shareit.booking.dto;

import lombok.AllArgsConstructor;

import lombok.Builder;
import ru.practicum.shareit.booking.model.BookingStatus;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.dto.UserDto;
import java.time.LocalDateTime;

import ch.qos.logback.core.status.Status;
import jakarta.validation.constraints.NotNull;

/**
 * TODO Sprint add-bookings.
 */
@Builder
@AllArgsConstructor
public class BookingDto {
	private Long id;
	private LocalDateTime start;
	private LocalDateTime end;
	private ItemDto item;
	private Long itemId;
	private UserDto booker;
	private Long bookerId;
	private Status status;
}

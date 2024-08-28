package ru.practicum.shareit.booking.dto;

import lombok.AllArgsConstructor;

import lombok.Builder;
import ru.practicum.shareit.booking.model.BookingStatus;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.dto.UserDto;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

/**
 * TODO Sprint add-bookings.
 */
@Builder
@AllArgsConstructor
public class BookingDto {
	private Long id;
	@NotNull(message = "Нельзя забронировать несуществующий предмет")
	private Item item;
	@NotNull(message = "Несуществующий пользователь не может совершать бронирование")
	private UserDto booker;
	@NotNull(message = "Для бронирования нужно выбрать дату начала")
	private LocalDateTime start;
	@NotNull(message = "Для бронирования нужно выбрать дату конца")
	private LocalDateTime end;
	private BookingStatus status;
}

package ru.practicum.shareit.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.practicum.shareit.booking.enm.BookingStatus;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class InputBookingDto {
	private Long id;

	@NotNull
	@FutureOrPresent
	private LocalDateTime start;

	@NotNull
	@FutureOrPresent
	private LocalDateTime end;

	@NotNull
	private Long itemId;

	@Null
	private BookingStatus status;
}
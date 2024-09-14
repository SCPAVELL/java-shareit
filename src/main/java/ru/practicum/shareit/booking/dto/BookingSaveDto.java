package ru.practicum.shareit.booking.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class BookingSaveDto {
	private Long id;
	@Future
	@NotNull
	private LocalDateTime start;
	@Future
	@NotNull
	private LocalDateTime end;
	@NotNull
	private Long itemId;

	@AssertTrue(message = "Дата начала должна быть раньше даты окончания")
	private boolean isValidDates() {
		if (start == null || end == null) {
			return true;
		}
		return start.isBefore(end);
	}
}

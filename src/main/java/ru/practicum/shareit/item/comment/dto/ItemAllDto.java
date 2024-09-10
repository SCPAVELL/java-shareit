package ru.practicum.shareit.item.comment.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.practicum.shareit.booking.dto.BookingDto;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ItemAllDto extends ItemDto {
	private BookingDto lastBooking;
	private BookingDto nextBooking;
	private List<CommentDto> comments;

	public ItemAllDto(Long id, @NotEmpty String name, @NotEmpty String description, @NotNull Boolean available,
			Long request, BookingDto lastBooking, BookingDto nextBooking, List<CommentDto> comments) {
		super(id, name, description, available, request);
		this.lastBooking = lastBooking;
		this.nextBooking = nextBooking;
		this.comments = comments;
	}
}

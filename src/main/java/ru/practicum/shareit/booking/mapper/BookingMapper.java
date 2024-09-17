package ru.practicum.shareit.booking.mapper;

import lombok.experimental.UtilityClass;
import ru.practicum.shareit.booking.dto.BookingDto;
import ru.practicum.shareit.booking.dto.InputBookingDto;
import ru.practicum.shareit.booking.dto.ShortBookingDto;
import ru.practicum.shareit.booking.enm.BookingStatus;
import ru.practicum.shareit.booking.model.Booking;
import ru.practicum.shareit.item.comment.model.Item;
import ru.practicum.shareit.item.mapper.ItemMapper;
import ru.practicum.shareit.user.mapper.UserMapper;
import ru.practicum.shareit.user.model.User;

@UtilityClass
public class BookingMapper {
	public static BookingDto toBookingDto(Booking booking) {
		return BookingDto.builder().id(booking.getId()).start(booking.getStart()).end(booking.getEnd())
				.item(ItemMapper.toItemDto(booking.getItem())).booker(UserMapper.toUserDto(booking.getBooker()))
				.status(booking.getStatus()).build();
	}

	public static ShortBookingDto toShortBookingDto(Booking booking) {
		return ShortBookingDto.builder().id(booking.getId()).bookerId(booking.getBooker().getId())
				.start(booking.getStart()).end(booking.getEnd()).build();
	}

	public static Booking toBooking(InputBookingDto inputBookingDto, Item item, User user, BookingStatus status) {
		return Booking.builder().id(inputBookingDto.getId()).start(inputBookingDto.getStart())
				.end(inputBookingDto.getEnd()).item(item).booker(user).status(status).build();
	}
}
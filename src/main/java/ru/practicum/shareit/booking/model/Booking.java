package ru.practicum.shareit.booking.model;

import lombok.*;
import ru.practicum.shareit.booking.enm.BookingStatus;
import ru.practicum.shareit.item.comment.model.Item;
import ru.practicum.shareit.user.model.User;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
@Entity
@Table(name = "bookings")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "start_date")
	private LocalDateTime start;

	@Column(name = "end_date")
	private LocalDateTime end;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id")
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booker_id")
	private User booker;

	@Column(name = "status")
	private BookingStatus status;
}
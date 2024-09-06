package ru.practicum.shareit.booking.model;

import jakarta.persistence.*;
import lombok.*;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.model.User;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
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
	@ManyToOne
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private Item item;
	@ManyToOne
	@JoinColumn(name = "booker_id", referencedColumnName = "id")
	private User booker;
	@Enumerated(EnumType.STRING)
	private Status status;
}
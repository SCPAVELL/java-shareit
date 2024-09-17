package ru.practicum.shareit.request.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.shareit.request.model.ItemRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemRequestRepository extends JpaRepository<ItemRequest, Long> {
	List<ItemRequest> findAllByRequesterIdOrderByCreatedDesc(Long requesterId);

	List<ItemRequest> findAllByRequesterIdNotOrderByCreatedDesc(Long requesterId, Pageable page);
}
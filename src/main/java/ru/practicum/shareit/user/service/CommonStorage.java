package ru.practicum.shareit.user.service;

import java.util.List;

@Deprecated
public interface CommonStorage<T> {
	T create(T t);

	T update(Long id, T t);

	List<T> findAll();

	T findById(Long id);

	void delete(Long id);
}
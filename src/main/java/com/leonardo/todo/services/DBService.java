package com.leonardo.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.todo.domain.Todo;
import com.leonardo.todo.repositories.TodoRepository;

@Service
public class DBService {
	@Autowired
	private TodoRepository todoRepository;

	public void instanciarBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Sprint Boot", LocalDateTime.parse("25/03/2022 10:40", formatter),
				false);

		todoRepository.saveAll(Arrays.asList(t1));

	}
}

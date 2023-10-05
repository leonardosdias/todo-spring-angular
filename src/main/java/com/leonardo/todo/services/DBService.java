package com.leonardo.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

	public void instanciarBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Sprint Boot", sdf.parse("25/03/2022 10:40"), false);

		todoRepository.saveAll(Arrays.asList(t1));

	}
}

package com.example.FirstProject.repository;

import com.example.FirstProject.model.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodolistRepository extends JpaRepository<Todolist, String> {
    public List<Todolist> findByNameTodo(String name);
}

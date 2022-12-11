package com.example.FirstProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tbl_todolist")
public class Todolist implements Serializable {

    @Id
    private String id;
    private String name_todo, due_date, difficulty, created_at, updated_at;

}

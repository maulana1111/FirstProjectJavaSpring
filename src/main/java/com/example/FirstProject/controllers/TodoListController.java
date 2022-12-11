package com.example.FirstProject.controllers;

import com.example.FirstProject.model.Todolist;
import com.example.FirstProject.repository.TodolistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class TodoListController {

    // @Autowired
    // private TodolistRepository todolistRepository;

    // @GetMapping("/todolist")
    // public ResponseEntity<List<Todolist>> getTodoList(@RequestParam(name = "name", required = false, defaultValue = "") String name){
    //     try {
    //         List<Todolist> todolists;
    //         if(StringUtils.hasText(name))
    //         {
    //             todolists = todolistRepository.findByNameTodo(name);
    //         }else{
    //             todolists = todolistRepository.findAll();
    //         }
    //         if(todolists.isEmpty())
    //         {
    //             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    //         }
    //         return  new ResponseEntity<>(todolists, HttpStatus.OK);
    //     }catch (Exception e)
    //     {
    //         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }

    // @GetMapping("/todolist/{id}")
    // public ResponseEntity<Todolist> findById(@PathVariable("id") String id){
    //     Optional<Todolist> todolist = todolistRepository.findById(id);
    //     if(todolist.isPresent()){
    //         return new ResponseEntity<>(todolist.get(), HttpStatus.OK);
    //     }
    //     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    // }

    // @PostMapping("/todolist")
    // public ResponseEntity<Todolist> create(@RequestBody Todolist todolist){
    //     try{
    //         Todolist newTodolist = new Todolist();
    //         Random rand = new Random();
    //         newTodolist.setId(String.valueOf(rand.nextInt(1, 999)));
    //         newTodolist.setName_todo(todolist.getName_todo());
    //         newTodolist.setDifficulty(todolist.getDifficulty());
    //         newTodolist.setDue_date(todolist.getDue_date());
    //         newTodolist.setCreated_at(todolist.getCreated_at());
    //         newTodolist.setUpdated_at(todolist.getUpdated_at());
    //         return new ResponseEntity<>(todolistRepository.save(newTodolist), HttpStatus.CREATED);
    //     }catch (Exception e){
    //         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }

    // @PutMapping("/todolist/{id}")
    // public ResponseEntity<Todolist> update(
    //         @PathVariable("id") String id,
    //         @RequestBody Todolist todolist
    // ){
    //     Optional<Todolist> todolistData = todolistRepository.findById(id);
    //     if(todolistData.isPresent())
    //     {
    //         Todolist updateTodo = todolistData.get();
    //         updateTodo.setName_todo(todolist.getName_todo());
    //         updateTodo.setDifficulty(todolist.getDifficulty());
    //         updateTodo.setDue_date(todolist.getDue_date());
    //         updateTodo.setCreated_at(todolist.getCreated_at());
    //         updateTodo.setUpdated_at(todolist.getUpdated_at());
    //         return new ResponseEntity<>(todolistRepository.save(updateTodo), HttpStatus.OK);
    //     }
    //     return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    // }

    // @DeleteMapping("/todolist/{id}")
    // public ResponseEntity<HttpStatus> delete(@PathVariable("id") String id){
    //     try {
    //         todolistRepository.deleteById(id);
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     }catch (Exception e){
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }

    // @DeleteMapping("/todolists")
    // public ResponseEntity<HttpStatus> deleteAll()
    // {
    //     try{
    //         todolistRepository.deleteAll();
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     }catch (Exception e){
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }


   @GetMapping
   public String welcome() {
       return "Welcome Anying";
   }
}

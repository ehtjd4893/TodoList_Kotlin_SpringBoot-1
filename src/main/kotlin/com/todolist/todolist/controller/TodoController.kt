package com.todolist.todolist.controller

import com.todolist.todolist.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class TodoController(
        private val todoService: TodoService
) {
//    @GetMapping

//    @PostMapping

//    @PutMapping

//    @DeleteMapping
}
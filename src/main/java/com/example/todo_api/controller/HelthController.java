package com.example.todo_api.controller;

import com.example.todoapi.controller.HelthApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthController implements HelthApi {
    @Override
    public ResponseEntity<Void> helthGet() {
        return ResponseEntity.ok().build();
    }
}

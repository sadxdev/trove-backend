package com.trovemarket.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestExceptionController {

    @GetMapping("/bad-request")
    public ResponseEntity<String> badRequest() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request triggered manually");
    }

    @GetMapping("/exception")
    public String throwException() {
        throw new RuntimeException("Something went wrong");
    }
}

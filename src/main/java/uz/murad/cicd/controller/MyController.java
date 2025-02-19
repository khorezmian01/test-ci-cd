package uz.murad.cicd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class MyController {


    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Welcome to CI/CD!!!");
    }
}

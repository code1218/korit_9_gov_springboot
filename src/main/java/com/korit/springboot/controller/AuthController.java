package com.korit.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//AuthenticationController
@RestController
public class AuthController {

    @PostMapping("/api/auth/signup")
    public ResponseEntity<String> signup() {
        return ResponseEntity.ok("회원가입완료");
    }

}










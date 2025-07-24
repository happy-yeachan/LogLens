package com.example.loglens.auth.controller;

import com.example.loglens.auth.dto.SignupRequestDto;
import com.example.loglens.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signup(@RequestBody SignupRequestDto requestDto) {
        authService.signup(requestDto);
        return ResponseEntity.ok().build(); // 상태코드 200 OK만 반환
    }
}

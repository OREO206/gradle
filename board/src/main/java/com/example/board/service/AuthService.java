package com.example.board.service;

import org.springframework.http.ResponseEntity;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.board.GetLatestListResponseDto;

public interface AuthService {
    ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
}

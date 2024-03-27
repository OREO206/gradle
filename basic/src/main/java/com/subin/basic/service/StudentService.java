package com.subin.basic.service;

import org.springframework.http.ResponseEntity;

import com.subin.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
}

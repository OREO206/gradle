package com.subin.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subin.basic.dto.request.student.PostStudentRequestDto;
import com.subin.basic.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

// 데이터 베이스에서 테이블은 클래스하고 맵핑됨

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    // CREATE
    @PostMapping("/")
    public ResponseEntity<String> postStudent(
        @RequestBody @Valid PostStudentRequestDto requestBody
    ) {
        ResponseEntity<String> response = studentService.postStudent(requestBody);
        return response;
    }

    // UPDATE
    @PatchMapping("/")
    public ResponseEntity<?> patchStudent() {
        return null;
    }

    // DELETE
    @DeleteMapping("/{studentNumber}")
    public ResponseEntity<?> deleteStudent(
        @PathVariable("studentNumber") Integer studentNumber
    ) {
        return null;
    }
    
}
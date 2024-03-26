package com.subin.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// null을 받으려고 이렇게 함
public class StudentEntity {
    private String name;
    private Integer age;
    private String address;
    private Boolean graduation;
}

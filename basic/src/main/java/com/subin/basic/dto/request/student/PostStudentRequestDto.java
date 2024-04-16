package com.subin.basic.dto.request.student;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// user만드는 것
@Getter
@Setter
@NoArgsConstructor
public class PostStudentRequestDto {

    @NotBlank // null, 빈문자열, 공백 불가
    private String name;

    @NotNull // int했을 땐 쓰면 안됨
    @Min(0)
    private Integer age;

    @NotBlank
    private String address;

    @NotNull
    private Boolean graduation;

    @NotBlank
    private String password;
}

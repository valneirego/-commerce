package com.valneirego.commerce.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class CustomError {

    private Instant timestamp;
    private Integer status;
    private String erro;
    private String path;


}



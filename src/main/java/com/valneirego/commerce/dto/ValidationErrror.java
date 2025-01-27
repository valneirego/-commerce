package com.valneirego.commerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationErrror extends  CustomError{

    private List<FieldMessage> erros = new ArrayList<>();

    public ValidationErrror(Instant timestamp, Integer status, String erro, String path) {
        super(timestamp, status, erro, path);
    }

    public void addError(String fieldName, String message){
        erros.add(new FieldMessage(fieldName,message));
    }
}

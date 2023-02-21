package com.nctr.training.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class BasicResponse {
    private String message;
    private String statusCode;
    private Object data;
    
}

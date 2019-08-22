package com.mooyle.cloud.common.advice;

import com.mooyle.cloud.common.exception.BusinessException;
import com.mooyle.cloud.common.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = BusinessException.class)
    public CommonResponse<String> handBusinessException(HttpServletRequest request, BusinessException ex){
        CommonResponse<String> response = new CommonResponse<>(-1, "Business exception");
        response.setData(ex.getMessage());
        return response;
    }
}

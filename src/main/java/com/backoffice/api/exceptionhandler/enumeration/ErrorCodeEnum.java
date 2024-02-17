package com.backoffice.api.exceptionhandler.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCodeEnum {

     GLOBAL("E00000")
     ;

     private String code;

}
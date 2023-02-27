package com.fastcam.programming.dmaker.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName :  com.fastcam.programming.dmaker.entity
 * fileName : StatusCode
 * author :  82108
 * date : 2023-02-27
 * description :
 */
@AllArgsConstructor
@Getter
public enum StatusCode {
    EMPLOYED("고용"),
    RETIRED("퇴직");

    private final String description;
}

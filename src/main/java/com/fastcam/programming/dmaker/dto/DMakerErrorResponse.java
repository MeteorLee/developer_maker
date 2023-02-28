package com.fastcam.programming.dmaker.dto;

import com.fastcam.programming.dmaker.exception.DMakerErrorCode;
import lombok.*;

/**
 * packageName :  com.fastcam.programming.dmaker.dto
 * fileName : DmakerResponse
 * author :  82108
 * date : 2023-02-28
 * description :
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DMakerErrorResponse {
    private DMakerErrorCode errorCode;
    private String errorMessage;

}

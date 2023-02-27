package com.fastcam.programming.dmaker.dto;

import com.fastcam.programming.dmaker.code.StatusCode;
import com.fastcam.programming.dmaker.entity.Developer;
import com.fastcam.programming.dmaker.type.DeveloperLevel;
import com.fastcam.programming.dmaker.type.DeveloperSkillType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

/**
 * packageName :  com.fastcam.programming.dmaker.dto
 * fileName : DeveloperDetailDto
 * author :  82108
 * date : 2023-02-26
 * description :
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeveloperDetailDto {
    private DeveloperLevel developerLevel;
    private DeveloperSkillType developerSkillType;
    private Integer experienceYears;
    private String memberId;
    private StatusCode statusCode;
    private String name;
    private Integer age;

    public static DeveloperDetailDto fromEntity(Developer developer) {
        return DeveloperDetailDto.builder()
                .developerLevel(developer.getDeveloperLevel())
                .developerSkillType(developer.getDeveloperSkillType())
                .experienceYears(developer.getExperienceYears())
                .memberId(developer.getMemberId())
                .statusCode(developer.getStatusCode())
                .name(developer.getName())
                .age(developer.getAge())
                .build();
    }
}

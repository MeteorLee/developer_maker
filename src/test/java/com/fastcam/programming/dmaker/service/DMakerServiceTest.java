package com.fastcam.programming.dmaker.service;

import com.fastcam.programming.dmaker.code.StatusCode;
import com.fastcam.programming.dmaker.dto.DeveloperDetailDto;
import com.fastcam.programming.dmaker.entity.Developer;
import com.fastcam.programming.dmaker.repository.DeveloperRepository;
import com.fastcam.programming.dmaker.repository.RetiredDeveloperRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static com.fastcam.programming.dmaker.type.DeveloperLevel.SENIOR;
import static com.fastcam.programming.dmaker.type.DeveloperSkillType.FRONT_END;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

/**
 * packageName :  com.fastcam.programming.dmaker.service
 * fileName : DMakerServiceTest
 * author :  82108
 * date : 2023-02-28
 * description :
 */
//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class DMakerServiceTest {

    @Mock
    private DeveloperRepository developerRepository;

    @Mock
    RetiredDeveloperRepository retiredDeveloperRepository;


    //    @Autowired
    @InjectMocks
    private DMakerService dMakerService;


    @Test
    public void testSomething() {
        given(developerRepository.findByMemberId(anyString()))
                .willReturn(Optional.of(Developer.builder()
                        .developerLevel(SENIOR)
                        .developerSkillType(FRONT_END)
                        .experienceYears(12)
                        .statusCode(StatusCode.EMPLOYED)
                        .name("name")
                        .age(12)
                        .build()));

        DeveloperDetailDto developerDetail = dMakerService.getDeveloperDetail("memberId");

        assertEquals(SENIOR, developerDetail.getDeveloperLevel());
        assertEquals(FRONT_END, developerDetail.getDeveloperSkillType());
        assertEquals(12, developerDetail.getExperienceYears());

    }


//    @Test
//    public void testSomething() {
//        dMakerService.createDeveloper(CreateDeveloper.Request.builder()
//                .developerLevel(DeveloperLevel.SENIOR)
//                .developerSkillType(DeveloperSkillType.FRONT_END)
//                .experienceYears(12)
//                .memberId("memberId")
//                .name("name")
//                .age(32)
//                .build());
//        List<DeveloperDto> allEmployedDevelopers = dMakerService.getAllEmployedDevelopers();
//        System.out.println("==========================");
//        System.out.println(allEmployedDevelopers);
//        System.out.println("==========================");
//    }
}
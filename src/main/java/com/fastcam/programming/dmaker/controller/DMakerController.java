package com.fastcam.programming.dmaker.controller;

import com.fastcam.programming.dmaker.dto.CreateDeveloper;
import com.fastcam.programming.dmaker.dto.DeveloperDetailDto;
import com.fastcam.programming.dmaker.dto.DeveloperDto;
import com.fastcam.programming.dmaker.dto.EditDeveloper;
import com.fastcam.programming.dmaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author HoSeung
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class DMakerController {

    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public List<DeveloperDto> getAllDevelopers() {
        // GET /developers HTTP/1.1
        log.info("GET /developers HTTP/1.1");

        return dMakerService.getAllEmployedDevelopers();
    }

    @GetMapping("/developer/{memberId}")
    public DeveloperDetailDto getDeveloperDetail(
            @PathVariable String memberId
    ) {
        log.info("GET /developer");

        return dMakerService.getDeveloperDetail(memberId);
    }


    @PostMapping("/create-developer")
    public CreateDeveloper.Response createDevelopers(
            @Valid @RequestBody CreateDeveloper.Request request
    ) {
        log.info("request : {}", request);

        return dMakerService.createDeveloper(request);
    }

    @PutMapping("/developer/{memberId}")
    public DeveloperDetailDto editDeveloper(
            @PathVariable String memberId,
            @Valid @RequestBody EditDeveloper.Request request
    ) {
        log.info("GET /developer");

        return dMakerService.editDeveloper(memberId,request);
    }

    @DeleteMapping("/developer/{memberId}")
    public DeveloperDetailDto deleteDeveloper(@PathVariable String memberId) {

        return dMakerService.deleteDeveloper(memberId);
    }


}

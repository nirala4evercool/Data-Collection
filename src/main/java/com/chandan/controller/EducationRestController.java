package com.chandan.controller;

import com.chandan.Service.DcService;
import com.chandan.binding.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EducationRestController {
    @Autowired
    private DcService service;
    @PostMapping("/education")
    public ResponseEntity<Long> saveEducation(@RequestBody Education education){
        Long caseNum=service.saveEducation(education);
        return new ResponseEntity<>(caseNum, HttpStatus.CREATED);
    }
}

package com.chandan.controller;

import com.chandan.Service.DcService;
import com.chandan.binding.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncomeRestController {
    @Autowired
    private DcService service;
    @PostMapping("/income")
    public ResponseEntity<Long> saveIncome(@RequestBody Income income){
        Long caseNum=service.saveIncomeData(income);
        return new ResponseEntity<>(caseNum, HttpStatus.CREATED);
    }
}

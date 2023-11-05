package com.chandan.controller;

import com.chandan.Service.DcService;
import com.chandan.binding.PlanSelection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PlanSelectionRestController {
    @Autowired
    private DcService service;
    @PostMapping("/plansel")
    public ResponseEntity<Long> planSelection(@RequestBody PlanSelection planSel){
        Long caseNum=service.savePlanSelection(planSel);
        return  new ResponseEntity<>(caseNum, HttpStatus.CREATED);
    }
}

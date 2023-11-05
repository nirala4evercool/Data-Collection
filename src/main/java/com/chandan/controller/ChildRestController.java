package com.chandan.controller;

import com.chandan.Service.DcService;
import com.chandan.binding.ChildRequest;
import com.chandan.binding.DcSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ChildRestController {
    @Autowired
    private DcService dcService;
    @PostMapping("/childrens")
    public ResponseEntity<DcSummary> saveChilds(@RequestBody ChildRequest request){
        Long caseNum=dcService.saveChildres(request);
        DcSummary summary=dcService.getSummary(caseNum);
        return new ResponseEntity<>(summary, HttpStatus.OK);
    }
}

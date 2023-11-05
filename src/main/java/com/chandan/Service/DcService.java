package com.chandan.Service;

import com.chandan.binding.*;

import java.util.Map;

public interface DcService {
    public Long loadCaseNum(Integer appId);
    public Map<Integer,String> getPlanNames();
    public Long savePlanSelection(PlanSelection planSelection);
    public  Long saveIncomeData(Income income);
    public  Long saveEducation(Education education);
    public  Long saveChildres(ChildRequest request);
    public DcSummary getSummary(Long caseNumber);
}

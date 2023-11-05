package com.chandan.entity;

import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DC_CASES")
@Data
public class DcCaseEntity {
    @Id
    @GeneratedValue
    private Integer caseId;
    private  Long caseNum;
    private  Integer appId;
    private  Integer planId;


}

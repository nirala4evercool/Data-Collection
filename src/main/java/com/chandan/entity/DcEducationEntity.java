package com.chandan.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DC_EDUCATION")
@Data
public class DcEducationEntity {
    @Id
    @GeneratedValue
    private  Integer eduId;
    private Long caseNum;
    private String highestQualification;
    private  Integer graduationYear;
}

package com.chandan.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "DC_CHILDREN")
@Data
public class DcChildrenEntity {
    @Id
    @GeneratedValue
    private Integer childId;
    private LocalDate childDob;
    private  Long childSsn;
    private Long caseNum;


}

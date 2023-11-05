package com.chandan.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "DC_INCOME")
@Data
public class DcIncomeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer incomeId;
    @Column(name = "case_num")
    private Long caseNum;
    private Double empIncome;
    private  Double propertyIncome;

}

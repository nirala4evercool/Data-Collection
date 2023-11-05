package com.chandan.repository;

import com.chandan.entity.DcIncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
public interface DcIncomeRepository extends JpaRepository<DcIncomeEntity, Serializable> {
    public DcIncomeEntity findByCaseNum(Long caseNum);
}


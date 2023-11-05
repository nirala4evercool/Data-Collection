package com.chandan.repository;

import com.chandan.entity.DcEducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface DcEducationRepository extends JpaRepository<DcEducationEntity, Serializable> {
    public DcEducationEntity findByCaseNum(Long caseNum);
}

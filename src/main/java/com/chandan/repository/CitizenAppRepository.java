package com.chandan.repository;

import com.chandan.entity.CitizenAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CitizenAppRepository extends JpaRepository<CitizenAppEntity, Serializable> {
}

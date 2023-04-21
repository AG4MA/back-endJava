package com.example.alessandro.repositories;

import com.example.alessandro.models.entities.ReportCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReportCodeRepository extends JpaRepository<ReportCode, Long>, JpaSpecificationExecutor<ReportCode> {

    public Optional<ReportCode> findReportCodeByIdentifier(String identifier);

}

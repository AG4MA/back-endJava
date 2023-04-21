package com.example.alessandro.services;

import com.example.alessandro.models.DTO.ReportCodeDTO;
import com.example.alessandro.models.entities.ReportCode;
import com.example.alessandro.repositories.ReportCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ReportCodeService {

    private ReportCodeRepository reportCodeRepository;

    @Autowired
    public ReportCodeService(ReportCodeRepository reportCodeRepository) {
        this.reportCodeRepository = reportCodeRepository;
    }

    public String addReportCode(ReportCode reportCode) {
        reportCodeRepository.save(reportCode);
        return "Report code salvato";
    }

    public List<ReportCodeDTO> getReportCodes() {
        List<ReportCode> result = reportCodeRepository.findAll();
        return result.stream().map(ReportCode::map).toList();
    }


}

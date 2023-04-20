package com.example.alessandro.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.alessandro.models.entities.ReportCode;
import com.example.alessandro.services.ReportCodeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1")
public class ReportCodeController {

    private ReportCodeService reportCodeService;
    public String result;

    @Autowired
    public ReportCodeController(ReportCodeService reportCodeService) {
        this.reportCodeService = reportCodeService;
    }

    @PostMapping("/report-code")
    public ResponseEntity<String> addReportCode(@RequestBody ReportCode reportCodeRequestBody) {
        //String result = reportCodeService.addReportCode(reportCodeRequestBody);
        this.result = String.valueOf(reportCodeRequestBody);
        System.out.println(reportCodeRequestBody);
        return new ResponseEntity<>("OK", HttpStatusCode.valueOf(200));
    }

    @GetMapping("/angular")
    public String extractUsername(HttpServletRequest request)  {


        return String.valueOf(result);
    }




}

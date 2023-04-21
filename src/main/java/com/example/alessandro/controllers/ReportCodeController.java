package com.example.alessandro.controllers;

import com.example.alessandro.models.DTO.ReportCodeDTO;
import com.example.alessandro.models.entities.ReportCode;
import com.example.alessandro.services.ReportCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        String result = reportCodeService.addReportCode(reportCodeRequestBody);
        //utilizzo dei servicies per utilizzare i dati.

        System.out.println(reportCodeRequestBody);
        return new ResponseEntity<>(result, HttpStatusCode.valueOf(200));
        //istanza di user
    }

    @GetMapping("/report-code")
    public ResponseEntity<List<ReportCodeDTO>> getReportCodes() {
        List<ReportCodeDTO> result = reportCodeService.getReportCodes();
        return new ResponseEntity<>(result, HttpStatusCode.valueOf(200));

    //istanza di user
    }

    /*@GetMapping("/angular")
    public ResponseEntity<Entity> getEntity()  {
        System.out.println(String.valueOf(result));
        //return String.valueOf(result);
        //return "ok";
        return new ResponseEntity<ReportCode>("OK", HttpStatusCode.valueOf(200));
    }*/




}

package com.example.solid.principles.ocp;

import com.example.solid.principles.ocp.after.ExcelReportGenerator;
import com.example.solid.principles.ocp.after.PDFReportGenerator;
import com.example.solid.principles.ocp.after.ReportService;
import com.example.solid.principles.ocp.after.WordReportGenerator;

import java.util.Map;

public class Ocp {
    public void run() {
        var generators = Map.of(
                "PDF", new PDFReportGenerator(),
                "Excel", new ExcelReportGenerator(),
                "Word", new WordReportGenerator()
        );

        var reportService = new ReportService(generators);
        reportService.generateReport("PDF");
        reportService.generateReport("Excel");
        reportService.generateReport("Word");
    }
}

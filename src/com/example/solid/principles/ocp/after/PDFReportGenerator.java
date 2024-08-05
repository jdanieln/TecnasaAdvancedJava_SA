package com.example.solid.principles.ocp.after;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating PDF report");
    }
}

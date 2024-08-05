package com.example.solid.ocp.after;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating PDF report");
    }
}

package com.example.solid.principles.ocp.after;

public class WordReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating Word report");
    }
}
package com.example.solid.ocp.after;

public class WordReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating Word report");
    }
}
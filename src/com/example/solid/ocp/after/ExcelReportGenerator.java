package com.example.solid.ocp.after;

public class ExcelReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating Excel report");
    }
}

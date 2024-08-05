package com.example.solid.principles.ocp.after;

public class ExcelReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating Excel report");
    }
}

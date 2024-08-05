package com.example.solid.ocp.before;

public class ReportGenerator {
    public void generateReport(String format) {
        if (format.equalsIgnoreCase("PDF")) {
            System.out.println("Generating PDF report");
        } else if (format.equalsIgnoreCase("Excel")) {
            System.out.println("Generating Excel report");
        } else if (format.equalsIgnoreCase("Word")) {
            System.out.println("Generating Word report");
        } else {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }
    }
}

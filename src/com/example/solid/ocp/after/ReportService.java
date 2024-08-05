package com.example.solid.ocp.after;

import java.util.Map;

public class ReportService {
    private final Map<String, ReportGenerator> generators;

    public ReportService(Map<String, ReportGenerator> generators) {
        this.generators = generators;
    }

    public void generateReport(String format) {
        ReportGenerator generator = generators.get(format);
        if (generator != null) {
            generator.generateReport();
        } else {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }
    }
}

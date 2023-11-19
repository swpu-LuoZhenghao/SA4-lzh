package org.example.service;

public class TaxCalculator {

    public static double calculateTax(double income) {
        // 简单的个人所得税计算逻辑，实际应用中需根据税法规定进行精确计算
        if (income <= 50000) {
            return income * 0.1;
        } else {
            return 50000 * 0.1 + (income - 50000) * 0.2;
        }
    }
}
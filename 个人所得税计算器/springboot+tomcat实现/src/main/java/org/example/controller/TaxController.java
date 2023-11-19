package org.example.controller;


import org.example.model.TaxResult;
import org.example.service.TaxCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculateTaxForm")
public class TaxController {

    @GetMapping
    public String showForm(TaxResult taxResult) {
        return "taxForm";
    }

    @PostMapping
    public String calculateTax(TaxResult taxResult, Model model) {
        double income = taxResult.getIncome();

        double tax = TaxCalculator.calculateTax(income);
        taxResult.setTax(tax);
        model.addAttribute("taxResult", taxResult);
        return "taxResult";
    }
}
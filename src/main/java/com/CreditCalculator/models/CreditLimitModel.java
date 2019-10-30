package com.CreditCalculator.models;

public class CreditLimitModel {
    String salary;
    String variableSalary;
    String companyYears;
    String patrimonyValue;
    String serasaPontuation;

    public CreditLimitModel(String salary,
                            String variableSalary,
                            String companyYears,
                            String patrimonyValue,
                            String serasaPontuation) {

        this.salary = salary;
        this.variableSalary = variableSalary;
        this.companyYears = companyYears;
        this.patrimonyValue = patrimonyValue;
        this.serasaPontuation = serasaPontuation;
    }

    public String getSalary() {
        return salary;
    }

    public String getVariableSalary() {
        return variableSalary;
    }

    public String getCompanyYears() {
        return companyYears;
    }

    public String getPatrimonyValue() {
        return patrimonyValue;
    }

    public String getSerasaPontuation() {
        return serasaPontuation;
    }
}

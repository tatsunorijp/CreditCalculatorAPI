package com.CreditCalculator.controller;

import com.CreditCalculator.models.CreditLimitModel;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.rule.Variable;


public class CalculatorController {

    public static double calculateCreditLimit(CreditLimitModel creditLimit) {
        // Load from 'FCL' file
        String fileName = "src/main/java/com/CreditCalculator/models/fuzzy.fcl";
        FIS fis = FIS.load(fileName,true);

        if( fis == null ) {
            System.err.println("Can't load file: '" + fileName + "'");
            return 0;
        }

        // Show
//        JFuzzyChart.get().chart(fis.getFunctionBlock("tipper"));

        // Set inputs
        fis.setVariable("salary", Double.parseDouble(creditLimit.getSalary()));
        fis.setVariable("variableSalary", Double.parseDouble(creditLimit.getVariableSalary()));
        fis.setVariable("companyYears", Double.parseDouble(creditLimit.getCompanyYears()));
        fis.setVariable("patrimonyValue", Double.parseDouble(creditLimit.getPatrimonyValue()));
        fis.setVariable("serasaPontuation", Double.parseDouble(creditLimit.getSerasaPontuation()));

        fis.evaluate();

        // Show output variable's chart
        Variable salaryValue = fis.getFunctionBlock("tipper").getVariable("creditValue");
//        JFuzzyChart.get().chart(salaryValue, salaryValue.getDefuzzifier(), true);

        // Print ruleSet
//        System.out.println(fis);

        return salaryValue.getLatestDefuzzifiedValue();
    }
}

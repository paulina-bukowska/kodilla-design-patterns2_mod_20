package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrsystem.SalaryProcessor;
import java.math.BigDecimal;
import java.util.List;

// "opakowuje" wywołanie metod systemu docelowego
// osiąga się to poprzez zaimplementowanie w klasie Adaptee interfejsu wywoływanego systemu w taki sposób, że klasa ta
// wywołuje odpowiednie metody dostarczane przez wywoływany system (klasa Adaptee staje się wrapperem tych metod).
public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}

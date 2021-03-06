package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.oldhrsystem.SalaryCalculator;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Klasę Adaptee rozszerza się (poprzez dziedziczenie przez klasę Adapter)
// i dodaje się funkcjonalności charakterystyczne dla interfejsu oczekiwanego przez system wywołujący.
// We wnętrzu metod adaptera następuje transformacja danych i przekazanie wywołań do "wewnętrznej klasy" Adaptee.
public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {
    @Override
    public double totalSalary(String[][] workers, double[] salaries) {
        List<Employee> employeeList = Stream
                .iterate(0, n -> n + 1)
                .limit(salaries.length)
                .map(n -> new Employee(workers[n][0], workers[n][1], workers[n][2], new BigDecimal(salaries[n])))
                .collect(Collectors.toList());

//        List<Employee> employeeList = new ArrayList<>();
//        for(int n = 0; n < salaries.length; n++) {
//            employeeList.add(new Employee(
//                    workers[n][0],
//                    workers[n][1],
//                    workers[n][2],
//                    new BigDecimal(salaries[n])
//                    ));
        return calculateSalaries(employeeList).doubleValue();
    }
}

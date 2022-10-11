package baitap.lab9_1;

import java.util.List;

public class Controller {
    public int calculatorSalary(List<Employee> employeeList){

        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}

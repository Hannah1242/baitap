package baitap.lab9_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee NguyenVanA = new FulltimeEmployee();
        Employee NguyenVanB = new FulltimeEmployee();
        Employee NguyenVanC = new FulltimeEmployee();
        Employee NguyenVanD = new ContaractEmployee();
        Employee NguyenVanE = new ContaractEmployee();

        List<Employee> employeeList = Arrays.asList(NguyenVanA, NguyenVanB, NguyenVanC, NguyenVanD, NguyenVanE);

        int totalSalary = new Controller().calculatorSalary(employeeList);
        System.out.println(totalSalary);


    }

}

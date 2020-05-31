package com.dropwizard.kickstart.dao;

import com.dropwizard.kickstart.vo.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private static List<Employee> listOfEmployee = new ArrayList<>();

    public static List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }
    public static void addEmployeeInDb(Employee employee) {
        listOfEmployee.add(employee);
    }

}

package com.asgarov.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee {
    private int employeeCount = 0;
    private String name;
    private String department;
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String dept) {
        this.name = name;
        this.department = dept;
        controls = new ArrayList<>();
    }

    public void addEmployee(IEmployee employee) {
        controls.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        controls.remove(employee);
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " works in " + this.department);
        for (IEmployee e : controls) {
            e.printStructures();
        }
    }

    @Override
    public int getEmployeeCount() {
        employeeCount=controls.size();
        for(IEmployee e: controls)
        {
            employeeCount+=e.getEmployeeCount();
        }
        return employeeCount;
    }

}

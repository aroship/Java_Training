package com.example.demo.services;

import com.example.demo.datas.Employee;
import com.example.demo.repositories.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employee-service")

public class EmployeeService {

    private final EmployeeRepo employeeRepo;
    EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo=employeeRepo;
    }

    public Employee getEmployee(int id){
        if(id<=0){
            throw new RuntimeException("ID cant be less than 1");
        }
        return this.employeeRepo.getEmployee(id);
    }

    public void addEmployee(Employee employee) {
        this.employeeRepo.addEmployee(employee);
    }
    public List<Employee> getEmployees() {
        return this.employeeRepo.getEmployees();
    }
    public void removeEmployee(int id) {
        this.employeeRepo.removeEmployee(id);
    }
}

package com.example.demo.controllers;

import com.example.demo.datas.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    private final EmployeeService employeeService;
    EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping("getemployee/{id}")
    private Employee getEmployee(@PathVariable int id){
        return this.employeeService.getEmployee(id);
    }
    @PostMapping("/employee")
    public @ResponseBody void postEmployee(@RequestParam String employeeID, @RequestParam String employeeName, @RequestParam String employeePhone) {
        this.employeeService.addEmployee(new Employee(employeeID, employeeName, employeePhone));;
    }
    @GetMapping("/employees")
    public @ResponseBody List<Employee> getEmployee() {
        return this.employeeService.getEmployees();
    }
    @DeleteMapping("/remove-employee/{id}")
    public void removeEmployee(@PathVariable int id){
         this.employeeService.removeEmployee(id);
    }

}

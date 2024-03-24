package com.example.demo.repositories;

import com.example.demo.datas.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("employee-repo")

public class EmployeeRepo {
    private final JdbcTemplate jdbcTemplate;
    public EmployeeRepo(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;

    }
    public void addEmployee(Employee employee){
        String sql="INSERT INTO EMPLOYEE(EMP_NAME, EMP_PHONE) VALUES(?,?)";
        this.jdbcTemplate.update(sql,employee.getEmployeeName(),employee.getEmployeePhone());
    }
    public Employee getEmployee(Integer id){
        String sql="SELECT * FROM EMPLOYEE WHERE EMP_ID= ?";
        return this.jdbcTemplate.queryForObject(sql,(rs,rowNum)-> {
            Employee e = new Employee();
            e.setEmployeeId(String.valueOf(rs.getInt("EMP_ID")));
            e.setEmployeeName(rs.getString("EMP_NAME"));
            e.setEmployeePhone(rs.getString("EMP_PHONE"));
            return e;

        },new Object[]{id});
    }

    public void removeEmployee(int id){
        String q = "delete from employee where emp_id = "+id;
        this.jdbcTemplate.update(q);
    }


    public List<Employee> getEmployees() {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM EMPLOYEE";
        List<Employee> employeesList = new ArrayList<>();
        this.jdbcTemplate.query(query, (resultSet)->{
            Employee e = new Employee();
            e.setEmployeeId(String.valueOf(resultSet.getInt("EMP_ID")));
            e.setEmployeeName(resultSet.getString("EMP_NAME"));
            e.setEmployeePhone(String.valueOf(resultSet.getInt("EMP_PHONE")));
            employeesList.add(e);
        });
        return employeesList;
    }


}

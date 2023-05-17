package in.employeemgt.service;

import java.util.List;

import in.employeemgt.Entity.EmployeeMaster;

public interface EmployeeServise {

    List<EmployeeMaster> getAllEmployees();
    
    EmployeeMaster getEmployeeById(int id);
    
    EmployeeMaster createEmployee(EmployeeMaster employee);
    
    EmployeeMaster updateEmployee(int id, EmployeeMaster updatedEmployee);
    
    boolean deleteEmployee(int id);
}

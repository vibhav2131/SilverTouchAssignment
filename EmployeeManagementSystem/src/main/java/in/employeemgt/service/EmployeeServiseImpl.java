package in.employeemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.employeemgt.Entity.EmployeeMaster;
import in.employeemgt.Entity.PersonalMaster;
import in.employeemgt.repository.EmployeeRepository;
import in.employeemgt.repository.PersonalMasterRepo;

@Service
public class EmployeeServiseImpl implements EmployeeServise {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PersonalMasterRepo personalRepository;

	@Override
	public List<EmployeeMaster> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeMaster createEmployee(EmployeeMaster employee) {
		PersonalMaster personalMaster = employee.getPersonalMaster();
		personalRepository.save(personalMaster);
		return employeeRepository.save(employee);
	}

	@Override
	public EmployeeMaster getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public EmployeeMaster updateEmployee(int id, EmployeeMaster updatedEmployee) {
		EmployeeMaster employee = employeeRepository.findById(id).orElse(null);
		if (employee != null) {
			employee.setPersonalMaster(updatedEmployee.getPersonalMaster());
			employee.setJoiningDate(updatedEmployee.getJoiningDate());
			employee.setSalary(updatedEmployee.getSalary());
			employee.setIsFresherEmployee(updatedEmployee.getIsFresherEmployee());

			return employeeRepository.save(employee);
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int id) {
		if (employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
			return true;
		}
		return false;
	}

}

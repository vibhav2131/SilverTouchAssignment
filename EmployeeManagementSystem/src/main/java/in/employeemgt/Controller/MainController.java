package in.employeemgt.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.employeemgt.Entity.EmployeeMaster;
import in.employeemgt.repository.EmployeeRepository;
import in.employeemgt.repository.PersonalMasterRepo;
import in.employeemgt.service.EmployeeServise;

@RestController
public class MainController {

	@Autowired
	private EmployeeServise servise;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PersonalMasterRepo personalMasterRepo;

	@GetMapping("/Employee{id}")
	public ResponseEntity<EmployeeMaster> getEmployeeById(@PathVariable("id") int id) {
		Optional<EmployeeMaster> employeeOptional = employeeRepository.findById(id);
		if (employeeOptional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(employeeOptional.get());
	}

	@PutMapping("/Employee{id}")
	public ResponseEntity<EmployeeMaster> updateEmployee(@PathVariable("id") int id,
			@RequestBody EmployeeMaster updatedEmployee) {
		Optional<EmployeeMaster> employeeOptional = employeeRepository.findById(id);
		if (employeeOptional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		EmployeeMaster employee = employeeOptional.get();
		employee.setPersonalMaster(updatedEmployee.getPersonalMaster());
		employee.setJoiningDate(updatedEmployee.getJoiningDate());
		employee.setSalary(updatedEmployee.getSalary());
		employee.setIsFresherEmployee(updatedEmployee.getIsFresherEmployee());

		employeeRepository.save(employee);

		return ResponseEntity.ok(employee);
	}

	@DeleteMapping("/Employee{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
		if (employeeRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		employeeRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}

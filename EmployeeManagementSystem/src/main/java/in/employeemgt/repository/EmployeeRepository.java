package in.employeemgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.employeemgt.Entity.EmployeeMaster;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeMaster, Integer> {

}

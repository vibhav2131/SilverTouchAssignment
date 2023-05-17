package in.employeemgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.employeemgt.Entity.PersonalMaster;

@Repository
public interface PersonalMasterRepo extends JpaRepository<PersonalMaster, Integer>{

}

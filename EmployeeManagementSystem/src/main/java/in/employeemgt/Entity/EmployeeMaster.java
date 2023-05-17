package in.employeemgt.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblemployeeMaster")
public class EmployeeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int id;

	@Column(name = "joining_date")
	private String joiningDate;

	@Column(name = "salary")
	private double salary;

	@Column(name = "isFresherEmployee")
	private String isFresherEmployee;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "personal_id", referencedColumnName = "id")
	private PersonalMaster personalMaster;

	@Embedded
	@OneToOne
	private QualificationMaster qualificationMaster;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getIsFresherEmployee() {
		return isFresherEmployee;
	}

	public void setIsFresherEmployee(String isFresherEmployee) {
		this.isFresherEmployee = isFresherEmployee;
	}

	public PersonalMaster getPersonalMaster() {
		return personalMaster;
	}

	public void setPersonalMaster(PersonalMaster personalMaster) {
		this.personalMaster = personalMaster;
	}

	public QualificationMaster getQualificationMaster() {
		return qualificationMaster;
	}

	public void setQualificationMaster(QualificationMaster qualificationMaster) {
		this.qualificationMaster = qualificationMaster;
	}

	@Override
	public String toString() {
		return "EmployeeMaster [id=" + id + ", joiningDate=" + joiningDate + ", salary=" + salary
				+ ", isFresherEmployee=" + isFresherEmployee + ", personalMaster=" + personalMaster
				+ ", qualificationMaster=" + qualificationMaster + "]";
	}

	public EmployeeMaster(int id, String joiningDate, double salary, String isFresherEmployee,
			PersonalMaster personalMaster, QualificationMaster qualificationMaster) {
		super();
		this.id = id;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.isFresherEmployee = isFresherEmployee;
		this.personalMaster = personalMaster;
		this.qualificationMaster = qualificationMaster;
	}

	public EmployeeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

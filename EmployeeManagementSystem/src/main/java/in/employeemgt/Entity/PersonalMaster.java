package in.employeemgt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblpersonalMaster")
public class PersonalMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private int id;
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "birtDate")
	private String birthDate;

	@Column(name = "gender")
	private String gender;

	public PersonalMaster(int id, String firstName, String lastName, String birthDate, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public PersonalMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "PersonalMaster [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", gender=" + gender + "]";
	}

}

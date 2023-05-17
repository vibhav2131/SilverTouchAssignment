package in.employeemgt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblqualificationMaster")
public class QualificationMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "qualification")
	private String qualification;

	public QualificationMaster(int id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}

	public QualificationMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "QualificationMaster [id=" + id + ", qualification=" + qualification + "]";
	}

}

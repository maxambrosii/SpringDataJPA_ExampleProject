package entity;

import javax.persistence.*;

@Entity
@Table(name = "TypeTraining")
public class TypeTraining{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CodTraining;
	
	@Column(name = "NameTraining")
	private String NameTraining;
	
	public TypeTraining() {
		
	}

	public Long getCodTraining() {
		return CodTraining;
	}

	public void setCodTraining(Long codTraining) {
		CodTraining = codTraining;
	}

	public String getNameTraining() {
		return NameTraining;
	}

	public void setNameTraining(String nameTraining) {
		NameTraining = nameTraining;
	}

	@Override
	public String toString() {
		return "TypeTraining [CodTraining=" + CodTraining + ", NameTraining=" + NameTraining + "]";
	}
	
}

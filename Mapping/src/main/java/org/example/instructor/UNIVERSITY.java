package org.example.instructor;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Data
@Entity
@Table(name = "university")

public class UNIVERSITY {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer UNIVERSITY_ID;
	@Column(name ="NAME")
	private String NAME;
	@Column(name ="Country")
	private String Country;
	@OneToMany(mappedBy ="University_D",cascade = CascadeType.ALL)
	private List<STUDENT> Students;
	
	
	

}

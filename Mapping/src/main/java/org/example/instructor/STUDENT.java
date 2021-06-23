package org.example.instructor;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "student")
public class STUDENT {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long STUDENT_ID;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "SECTION")
	private String section;
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "UNIVERSITY_ID")
	private UNIVERSITY university;
	public STUDENT(String firstName, String lastName, String section) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		
	}
	public Long getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(Long sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public UNIVERSITY getUniversity() {
		return university;
	}
	public void setUniversity(UNIVERSITY university) {
		this.university = university;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (STUDENT_ID^ (STUDENT_ID >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		STUDENT other = (STUDENT) obj;
		if (STUDENT_ID == null) {
			if (other.STUDENT_ID != null)
				return false;
		} else if (!STUDENT_ID.equals(other.STUDENT_ID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (university == null) {
			if (other.university != null)
				return false;
		} else if (!university.equals(other.university))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "STUDENT [STUDENT_ID=" + STUDENT_ID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", section=" + section + ", university=" + university + "]";
	}
	
	
	
}

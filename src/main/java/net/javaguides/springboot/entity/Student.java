package net.javaguides.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.javaguides.springboot.entity.Departement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	//Aissa 
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 45 , nullable = false)
	private String firstName;
	
	@Column(length = 45 , nullable = false)
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "departement_id")
	private Departement departement;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String departement) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departement = new Departement(departement, 5);
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

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	

}

package net.javaguides.springboot.web.dto;

public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	private String CNI;
	private String CNE;
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String firstName, String lastName, String email, String CNI, String SNE) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.CNI = CNI;
		
	}
	
	public String getCNI() {
		return CNI;
	}

	public void setCNI(String cNI) {
		CNI = cNI;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

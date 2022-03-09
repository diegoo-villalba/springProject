package spring.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull
	@Size(min=3, message=" Field required")
	private String name;
	
	
	private String lastname;
	private String gender;
	private String ocuppation;
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOcuppation() {
		return ocuppation;
	}

	public void setOcuppation(String ocuppation) {
		this.ocuppation = ocuppation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastName) {
		this.lastname = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

}

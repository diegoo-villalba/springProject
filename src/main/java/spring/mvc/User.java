package spring.mvc;

public class User {

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

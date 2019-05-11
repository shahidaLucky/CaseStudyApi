package bnym.casestudy.CaseStudyApi.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class RegistrationRequest {
	@NotEmpty
	@Size(min = 4, max = 50, message = "First name need to between 4 to 50 characters")
	private String firstName;

	@NotEmpty
	@Size(min = 4, max = 50, message = "Last name need to between 4 to 50 characters")
	private String lastName;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	@Size(min = 10, max = 10, message = "Employee Id Me must be 10 characters")
	private String employeeId;

	@NotEmpty
	@Min(value = 6, message = "Password should not be less than 6")
	private String password;

	@NotEmpty
	private String passwordRepeat;

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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	@Override
	public String toString() {
		return "RegistrationRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", employeeId=" + employeeId + ", password=" + password + ", passwordRepeat=" + passwordRepeat + "]";
	}
}

package bnym.casestudy.CaseStudyApi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	private int id;
	@Column(length=60)
	private String email;
	@Column(length=128)
	private String password;
}

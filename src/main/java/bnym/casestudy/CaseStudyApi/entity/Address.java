package bnym.casestudy.CaseStudyApi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "street_line_1")
	private String streetLine1;

	@Column(name = "street_line_2")
	private String streetLine2;
}

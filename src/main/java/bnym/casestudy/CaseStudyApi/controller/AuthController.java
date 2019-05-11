package bnym.casestudy.CaseStudyApi.controller;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bnym.casestudy.CaseStudyApi.entity.Employee;
import bnym.casestudy.CaseStudyApi.entity.Login;
import bnym.casestudy.CaseStudyApi.request.RegistrationRequest;

@Transactional
@RestController
@RequestMapping(path = "/api/auth")
public class AuthController {

	@Autowired
	EntityManager em;

	@PostMapping(path = "/register")
	public ResponseEntity<String> register(@Valid @RequestBody RegistrationRequest req) {
		Employee employee = new Employee();
		employee.setId(req.getEmployeeId());
		employee.setFirstName(req.getFirstName());
		employee.setLastName(req.getLastName());

		Login login = new Login();
		login.setEmail(req.getEmail());
		login.setPassword(req.getPassword());
		em.persist(login);

		employee.setLoginDetails(login);
		em.persist(employee);
		return ResponseEntity.ok("Valid");
	}

}

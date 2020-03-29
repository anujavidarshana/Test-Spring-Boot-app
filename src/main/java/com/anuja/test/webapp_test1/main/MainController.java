package com.anuja.test.webapp_test1.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anuja.dto.PersonDto;
import com.anuja.model.PersonEntity;
import com.anuja.repository.PersonReopsitory;
import com.anuja.spring.services.Test;
import com.anuja.spring.services.TestServices;
import com.anuja1.dependent_app.DependentApp;

@RestController
public class MainController {

	@Autowired
	private TestServices testservices;

	@Autowired
	private Test test;

	@Autowired
	private PersonReopsitory personReopsitory;

	@Autowired
	private DependentApp dependent;

	@Value("${app.name}")
	private String ymlValue;

	@RequestMapping("/hello")
	public Test hiMethod() {
		testservices.setName("Anja");
		testservices.setAddress("Add1");
		testservices.getAddress();
//		dependent
//		new Test();

//		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
//		Test test = factory.getBean(Test.class);
		test.setTestAge("21");
//		test.setTestName(ymlValue);

		List<PersonEntity> personList = (List<PersonEntity>) personReopsitory.findAll();
		System.out.println(personList);
		return test;
	}

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public PersonDto testPostMethod(@RequestBody PersonDto person) {

		PersonEntity entity = new PersonEntity(person.getName(), person.getAge());
//		Transaction transaction = null;
//		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//			// start transaction
//			transaction = session.beginTransaction();
//
//			// save person
//			session.save(entity);
//
//			// commit transaction
//			transaction.commit();
//
//		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//		}

		return person;
	}
}

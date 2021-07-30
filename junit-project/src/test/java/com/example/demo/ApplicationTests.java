package com.example.demo;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
		String message = this.restTemplate.getForObject("/about", String.class);
		assertEquals("JUnit 5 and Spring Boot Example.", message);
	}
	@Test
	void testPerson()
	{
		Person person=new Person(1, "John");
		Person tempPerson=this.restTemplate.getForObject("/person", Person.class);
		assertEquals(person.getName(), tempPerson.getName());
	}
		
	}



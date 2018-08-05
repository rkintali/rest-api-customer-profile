package au.com.qantas.restapicustomerprofile;

import java.util.Arrays;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import au.com.qantas.restapicustomerprofile.customer.Address;
import au.com.qantas.restapicustomerprofile.customer.Customer;
import au.com.qantas.restapicustomerprofile.customer.CustomerRepository;

@SpringBootApplication
public class RestApiCustomerProfileApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiCustomerProfileApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Address address1 = new Address("HOME1", "ADDRESS LINE1", "ADDRESS LINE2 RESOURCE", "ADDRESS LINE 3 RESOURCE", "MASCOT", "2000", "NSW", "AU");
		Address address2 = new Address("HOME2", "ADDRESS LINE1", "ADDRESS LINE2 RESOURCE", "ADDRESS LINE 3 RESOURCE", "MASCOT", "2001", "NSW", "AU");
		Address address3 = new Address("HOME3", "ADDRESS LINE1", "ADDRESS LINE2 RESOURCE", "ADDRESS LINE 3 RESOURCE", "MASCOT", "2002", "NSW", "AU");
		Address address4 = new Address("HOME4", "ADDRESS LINE1", "ADDRESS LINE2 RESOURCE", "ADDRESS LINE 3 RESOURCE", "MASCOT", "2003", "NSW", "AU");
		Address address5 = new Address("HOME5", "ADDRESS LINE1", "ADDRESS LINE2 RESOURCE", "ADDRESS LINE 3 RESOURCE", "MASCOT", "2005", "NSW", "AU");
		
		logger.info("Customer id 10001 -> {}", repository.findById(10001L));

		logger.info("Inserting -> {}", repository.save(new Customer("firstname2","lastname2",new Date(),Arrays.asList(address1,address5))));
		logger.info("Inserting -> {}", repository.save(new Customer("firstname3","lastname3",new Date(), Arrays.asList(address2))));
		logger.info("Inserting -> {}", repository.save(new Customer("firstname4","lastname4",new Date(), Arrays.asList(address3))));

		//logger.info("Update 10003 -> {}", repository.save(new Customer(2L,"updatedfirstname","updatedlastname",new Date(), Arrays.asList(address4))));

		//repository.deleteById(3L);

		logger.info("All users -> {}", repository.findAll());
	}
}

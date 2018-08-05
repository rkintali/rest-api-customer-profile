package au.com.qantas.restapicustomerprofile.customer;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class CustomerResource {
	
	@Autowired
	CustomerRepository repository;
	
	@GetMapping("/customer")
	
	public List<Customer> retrieveAllCustomers() {
		return repository.findAll();
	}
	
	@GetMapping("/customer/{customerID}")
	public Customer retrieveCustomer(@PathVariable long customerID) {
		Optional<Customer> customer = repository.findById(customerID);

		if (!customer.isPresent())
			throw new CustomerNotFoundException("Customer ID " + customerID +" not found");

		return customer.get();
	}

	@DeleteMapping("/customer/{customerID}")
	public void deleteCustomer(@PathVariable long customerID) {
		Optional<Customer> customer = repository.findById(customerID);

		if (!customer.isPresent())
			throw new CustomerNotFoundException("Customer ID " + customerID +" not found");

		repository.deleteById(customerID);
	}

	@PostMapping("/customer")
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
		Customer savedCustomer = repository.save(customer);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{customerID}")
				.buildAndExpand(savedCustomer.getCustomerID()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/customer/{customerID}")
	public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer, @PathVariable long id) {

		Optional<Customer> customerOptional = repository.findById(id);

		if (!customerOptional.isPresent())
			return ResponseEntity.notFound().build();

		customer.setCustomerID(id);
		
		repository.save(customer);

		return ResponseEntity.noContent().build();
	}


}

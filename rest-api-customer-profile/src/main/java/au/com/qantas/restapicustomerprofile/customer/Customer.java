package au.com.qantas.restapicustomerprofile.customer;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long customerID;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Address> address;

	
	public Customer() {
		super();
	}


	public Customer(Long customerID,  String firstName, String lastName, Date dateOfBirth, List<Address> address) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public Customer(String firstName, String lastName, Date dateOfBirth, List<Address> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public Long getCustomerID() {
		return customerID;
	}


	

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	
	
}

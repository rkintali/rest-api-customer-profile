package au.com.qantas.restapicustomerprofile.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long addressID;
	private String addressType;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String suburb;
	private String postcode;
	private String state;
	private String country;
	
	
	
	
	public Address() {
		super();
	}
	public Address(Long addressID, String addressType, String addressLine1, String addressLine2, String addressLine3,
			String suburb, String postcode, String state, String country) {
		super();
		this.addressID = addressID;
		this.addressType = addressType;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
		this.country = country;
	}
	public Address(String addressType, String addressLine1, String addressLine2, String addressLine3,
			String suburb, String postcode, String state, String country) {
		super();
		this.addressType = addressType;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
		this.country = country;
		
	}

	public Long getAddressID() {
		return addressID;
	}

	public void setAddressID(Long addressID) {
		this.addressID = addressID;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", addressType=" + addressType + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", suburb=" + suburb
				+ ", postcode=" + postcode + ", state=" + state + ", country=" + country + ", customer=" 
				+ "]";
	}



}

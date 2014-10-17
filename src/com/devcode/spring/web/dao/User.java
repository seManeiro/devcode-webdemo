package com.devcode.spring.web.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User  {
	
	

	@NotBlank(groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Size(min=5,max=15,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Pattern(regexp="^\\w{5,}$",groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Id
	@Column(name="username")
	private String username;

	@Email(groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@NotBlank(groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Size(min=5,max=100,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="email")
	private String email;

	@NotBlank(groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Pattern(regexp="^\\S+$",groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Size(min=5,max=25,groups={FormValidationGroup.class})
	@Column(name="password")
	private String password;

	@Size(min=1,max=60,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="firstname")
	private String firstname;

	@Size(min=1,max=60, groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dob")
	private String dob;

	@Size(min=1,max=60,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="country")
	private String country;
	
	@Size(min=1,max=60,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="city")
	private String city;

	@Size(min=1,max=60,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="street")
	private String street;

	@Size(min=1,max=60,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="zipcode")
	private String zipcode;

	@Size(min=1,max=250,groups={PersistanceValidationGroup.class,FormValidationGroup.class})
	@Column(name="phone")
	private String phone;

	@Column(name="authority")
	private String authority;

	@Column(name="enabled")
	private boolean enabled = false;

	public User() {

	}

	public User(String username, String email, String password,
			String authority, boolean enabled) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.authority = authority;
		this.enabled = enabled;
	}

	public User(String firstname, String lastname, String username,
			String email, String password,String dob, String country, String city,
			String street, String zipcode, String phone, String authority,
			boolean enabled) {

		this.firstname = firstname;
		this.lastname = lastname;

		this.username = username;
		this.email = email;
		this.password = password;
		this.dob = dob;
		
		this.country = country;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
		this.phone = phone;
		this.authority = authority;
		this.enabled = enabled;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((authority == null) ? 0 : authority.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result
				+ ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (authority == null) {
			if (other.authority != null)
				return false;
		} else if (!authority.equals(other.authority))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enabled != other.enabled)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email
				+ ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dob=" + dob + ", country=" + country + ", city=" + city
				+ ", street=" + street + ", zipcode=" + zipcode + ", phone="
				+ phone + ", authority=" + authority + ", enabled=" + enabled
				+ "]";
	}

	
	
}
	
	
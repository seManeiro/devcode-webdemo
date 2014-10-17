package com.devcode.spring.web.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@NotNull(groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@NotBlank(groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	@Size(min = 1, max = 60, groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	private String category;

	@NotNull
	@Size(min = 1, max = 60, groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	private String brand;

	@NotBlank(groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	@Size(min = 5, max = 60, groups = { PersistanceValidationGroup.class,FormValidationGroup.class })
	private String name;

	@NotBlank(groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	@Size(min = 2, max = 60, groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	private String origin;

	@NotBlank(groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	private String code;

	@NotNull(groups = {PersistanceValidationGroup.class, FormValidationGroup.class})
	private int quantity;

	@NotNull(groups = {PersistanceValidationGroup.class, FormValidationGroup.class})
	private double price;

	@NotBlank(groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	@Size(min = 5, max = 1000, groups = { PersistanceValidationGroup.class, FormValidationGroup.class })
	private String description;

	private String img;

	public Product() {

	}

	public Product(int id, String category, String brand, String name,
			String origin, String code, int quantity, double price,
			String description) {
		this.id = id;
		this.category = category;
		this.brand = brand;
		this.name = name;
		this.origin = origin;
		this.code = code;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}

	public Product(int id, String category, String brand, String name,
			String origin, String code, int quantity, double price,
			String description, String img) {
		this.id = id;
		this.category = category;
		this.brand = brand;
		this.name = name;
		this.origin = origin;
		this.code = code;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
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
		Product other = (Product) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", brand="
				+ brand + ", name=" + name + ", origin=" + origin + ", code="
				+ code + ", quantity=" + quantity + ", price=" + price
				+ ", description=" + description + "]";
	}

	

}

package app.hbm.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Dealer {

	@Id
	@GenericGenerator(name = "id_inc", strategy = "increment")
	@GeneratedValue(generator = "id_inc")
	private int dealerId;
	private String name;
	private String shopeName;
	
	/**
	 * 
	 * If Cascade is not used here, then in Dealer table ADDRESS column will be defined & long byte stream will be added.
	 * Because address type is an Object, so if we do not define relationship of object then it insert a very long byte stream in this column in DB
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)  
	private Address address;
	private String phone;
	
	@OneToMany(cascade = CascadeType.DETACH)
	private List<Product> product;
	
	
	
	
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShopeName() {
		return shopeName;
	}
	public void setShopeName(String shopeName) {
		this.shopeName = shopeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

package app.hbm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Address implements Serializable{
	
	@Id
	@GenericGenerator(name = "addr_id", strategy = "app.hbm.generate.id.AddressIdGenerator") //Custom Id Generator class in strategy
	@GeneratedValue(generator = "addr_id")//custom id generator mapped with @GenericGenerator of name
	@Column(columnDefinition = "VARCHAR", length = 11)
	private String addressId;
	
	/**
	 * Address types : Shop(dealer) | Shipping | Billing
	 */
	private String addressType; 
	private String Line1;
	private String line2;
	private String line3;
	private String city;
	private String state;
	private String country;
	private String pin;
	private String landmark;
	
	/**
	 * For longitudes use: Decimal(9,6)
	 * Should be visible like - ###.######
	 */
	private double longitude;
	
	/**
	 * For longitudes use: Decimal(8,6)
	 * Should be visible like - ##.######
	 */
	private double lattitude;

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getLine1() {
		return Line1;
	}

	public void setLine1(String line1) {
		Line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressType=" + addressType + ", city=" + city + ", pin=" + pin
				+ "]";
	}
	
	

}

package app.hbm.model;

import javax.persistence.Embeddable;

@Embeddable //Will not create new table. will insert address data in existing Customer table  
public class AddressShipping {

	private String line1;
	private String line2;
	private String line3;
	private String landmark;
	private String pin;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
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
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "AddressShipping [line1=" + line1 + ", line2=" + line2 + ", line3=" + line3 + ", landmark=" + landmark
				+ ", pin=" + pin + "]";
	}
	
}

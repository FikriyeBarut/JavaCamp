package oop1;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxtNumber;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxtName() {
		return taxtNumber;
	}

	public void setTaxtNumber(String taxtNumber) {
		this.taxtNumber = taxtNumber;
	}

}

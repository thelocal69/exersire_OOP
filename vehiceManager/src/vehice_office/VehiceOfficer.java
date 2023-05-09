package vehice_office;

import java.io.Serializable;

public class VehiceOfficer implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String productCode;
	private String productBrand;
	private int yearOfManufature;
	private String productColor;
	
	public VehiceOfficer() {}

	public VehiceOfficer(int id, String productCode, String productBrand, int yearOfManufature, String productColor) {
		this.id = id;
		this.productCode = productCode;
		this.productBrand = productBrand;
		this.yearOfManufature = yearOfManufature;
		this.productColor = productColor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public int getYearOfManufature() {
		return yearOfManufature;
	}

	public void setYearOfManufature(int yearOfManufature) {
		this.yearOfManufature = yearOfManufature;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	
	
}

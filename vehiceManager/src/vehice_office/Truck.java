package vehice_office;

public class Truck extends VehiceOfficer{
	private static final long serialVersionUID = 1L;
	private String tonnage;
	
	public Truck() {}

	public Truck(int id, String productCode, String productBrand, int yearOfManufature, String productColor, String tonnage) {
		super(id, productCode, productBrand, yearOfManufature, productColor);
		this.tonnage = tonnage;
	}

	public String getTonnage() {
		return tonnage;
	}

	public void setTonnage(String tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public String toString() {
		return "Truck [tonnage=" + tonnage + "]";
	}
	
	
}

package vehice_office;

public class MotorBike extends VehiceOfficer{
	private static final long serialVersionUID = 1L;
	private String power;
	
	public MotorBike() {}

	public MotorBike(int id, String productCode, String productBrand, int yearOfManufature, String productColor, String power) {
		super(id, productCode, productBrand, yearOfManufature, productColor);
		this.power = power;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "MotorBike [power=" + power + "]";
	}
	
	
}

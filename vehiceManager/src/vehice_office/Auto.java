package vehice_office;

public class Auto extends VehiceOfficer{
	private static final long serialVersionUID = 1L;
	private byte seat;
	private String engine;
	
	public Auto() {}

	public Auto(int id, String productCode, String productBrand, int yearOfManufature, String productColor, byte seat, String engine) {
		super(id, productCode, productBrand, yearOfManufature, productColor);
		this.seat = seat;
		this.engine = engine;
	}

	public byte getSeat() {
		return seat;
	}

	public void setSeat(byte seat) {
		this.seat = seat;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Auto Id "+getId()+" | Code "+getProductCode()+" | Brand "+getProductBrand()+" | YOM "+ getYearOfManufature()+
				" | Color "+getProductColor()+" | Seat "+getSeat()+" | Engine "+getEngine();
	}

	
	
}

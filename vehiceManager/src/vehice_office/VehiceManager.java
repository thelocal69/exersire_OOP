package vehice_office;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehiceManager {
	public static final Scanner SCANNER = new Scanner(System.in);
	private List<VehiceOfficer> listVehice;
	private VehiceIO vehiceIO;
	
	
	public VehiceManager() {
		vehiceIO = new VehiceIO();
		listVehice = vehiceIO.read();
	}
	
	public void addAuto() {
		int id = (listVehice.size()>0) ? (listVehice.size()+1) : 1;
		System.out.printf("Vehice ID: %d%n", id);
		String productCode = inputProductCode();
		String productBrand = inputProductBrand();
		int yearOfManufac = inputYOM();
		String productColor = inputProductColor();
		byte seat = inputSeat();
		String engine = inputEngine();
		
		VehiceOfficer addAuto = new Auto(id, productCode, productBrand, yearOfManufac, productColor, seat, engine);
		listVehice.add(addAuto);
		vehiceIO.write(listVehice);
	}
	
	public void editAuto(int id) {
		boolean isExisted = false;
		int size = listVehice.size();
		for (int i = 0; i < size; i++) {
			if (listVehice.get(i).getId() == id) {
				isExisted = true;
				listVehice.get(i).setProductCode(inputProductCode());
				listVehice.get(i).setProductBrand(inputProductBrand());
				listVehice.get(i).setYearOfManufature(inputYOM());
				listVehice.get(i).setProductColor(inputProductColor());
				break;
			}
		}
		if (!isExisted) System.out.printf("%nId = %d not existed !", id);
		else vehiceIO.write(listVehice);
	}
	
	public void delete(int id) {
		VehiceOfficer vehiceOfficer = null;
		int size = listVehice.size();
		for (int i = 0; i < size; i++) {
			if (listVehice.get(i).getId() == id) {
				vehiceOfficer = listVehice.get(i);
				break;
			}
		}
		if (vehiceOfficer != null) {
			listVehice.remove(vehiceOfficer);
			vehiceIO.write(listVehice);
		}else System.out.printf("%nId = %d not existed !", id);
	}
	
	public void showVehice() {
		for (VehiceOfficer vehiceOfficer : listVehice) {
			System.out.println(vehiceOfficer.toString());
		}
	}
	
	
	
	private String inputEngine() {
		System.out.println("Input Engine: ");
		return SCANNER.nextLine();
	}

	private byte inputSeat() {
		System.out.println("Input seat auto: ");
		while (true) {
			try {
				byte seat = Byte.parseByte(SCANNER.nextLine());
				if(seat <= 0) throw new NumberFormatException();
				return seat;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! Input again !");
			}
		}
	}

	private String inputProductColor() {
		System.out.println("Input color: ");
		return SCANNER.nextLine();
	}

	private String inputProductBrand() {
		System.out.println("Input Brand: ");
		return SCANNER.nextLine();
	}

	private int inputYOM() {
		System.out.println("Input year of manufacture: ");
		while (true) {
			try {
				int year = Integer.parseInt(SCANNER.nextLine());
				if (year <= 0) throw new NumberFormatException();
				return year;
			} catch (NumberFormatException e) {
				System.out.println("Invalid ! Input again !");
			}
		}
	}

	private String inputProductCode() {
		System.out.println("Input Product code: ");
		return SCANNER.nextLine();
	}

	public List<VehiceOfficer> getListVehice() {
		return listVehice;
	}
	public void setListVehice(List<VehiceOfficer> listVehice) {
		this.listVehice = listVehice;
	}

	public int inputId() {
		System.out.println("Input Id: ");
		while (true) {
			try {
				int id = Integer.parseInt(SCANNER.nextLine());
				return id;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

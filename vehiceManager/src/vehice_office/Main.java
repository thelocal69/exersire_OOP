package vehice_office;

import java.util.Scanner;

public class Main {
	public static final Scanner SCANNER = new Scanner(System.in);
	public static void main(String[] args) {
		VehiceManager vehiceManager = new VehiceManager();
		int inputId;
		char choose;
		showMenu();
		while (true) {
			choose = SCANNER.next().charAt(0);
			switch (choose) 
			{
			
			case '1': {
				showAddMenu();
				char type = SCANNER.next().charAt(0);
				switch (type) 
				{
				
				case '1': {
					vehiceManager.addAuto();
					break;
				}

				case '2': {
					
					break;
				}

				case '3': {
					
					break;
				}

				case '0': {System.out.println("Turn back menu");break;}
				
				default:
					System.out.println("invalid! please choose action in below menu:");
					break;
				}
				break;
			}

			case '2': {
				showEditMenu();
				char type = SCANNER.next().charAt(0);
				switch (type) 
				{
				
				case '1': {
					inputId = vehiceManager.inputId();
					vehiceManager.editAuto(inputId);
					break;
				}

				case '2': {
					
					break;
				}

				case '3': {
					
					break;
				}

				case '0': {System.out.println("Turn back menu");break;}
				
				default:
					System.out.println("invalid! please choose action in below menu:");
					break;
				}
				break;
			}
			case '3': {
				inputId = vehiceManager.inputId();
				vehiceManager.delete(inputId);
				System.out.println("The ID "+inputId+" is deleted !");
				break;
			}
			case '4': {
				vehiceManager.showVehice();
				break;
			}

			case '0': {
				System.out.println("Program is closed !");
				return;
			}
			
			default:
				System.out.println("invalid! please choose action in below menu:");
				break;
			}
			showMenu();
		}
	}
	
	public static void showMenu() {
		System.out.println();
		System.out.println("\t\t\tApplication Vehice Manager");
		System.out.println("1. Add vehice");
		System.out.println("2. Edit vehice");
		System.out.println("3. Delete vehice");
		System.out.println("4. Show vehice list");
		System.out.println("0. Close program");
		System.out.println("Please choose !");
		System.out.println();
	}
	
	public static void showAddMenu() {
		System.out.println();
		System.out.println("1. Add auto");
		System.out.println("2. Add motorbike");
		System.out.println("3. Add truck");
		System.out.println("0. Exit");
		System.out.println("Please choose !");
		System.out.println();
	}
	
	public static void showEditMenu() {
		System.out.println();
		System.out.println("1. Edit auto");
		System.out.println("2. Edit motorbike");
		System.out.println("3. Edit truck");
		System.out.println("0. Exit");
		System.out.println("Please choose !");
		System.out.println();
	}
	
}

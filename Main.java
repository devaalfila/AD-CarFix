import java.util.Scanner ;

public class Main {

	
	public Main() {
		Scanner scan = new Scanner(System.in);
				
		String service;
		String name;
		String type;
		String model;
		String problem;
		String wash;
		int Serviceacar;
		int Exit; 
		
		
		System.out.println("AD CarFix");
		System.out.println();
		System.out.println("=========");
		System.out.println("Income = 0");
		System.out.println("=========");
		System.out.println();
		System.out.println("1. Service a car");
		System.out.println("2. Exit");
		System.out.println();
		
		
		do {
			System.out.println(" Choose [ 1 | 2 ]");
			service = scan.nextLine();
			if(service.equals("1") || service.equals("2")) {
				;
				break;
			}
		}while(true);
		if(service.equals("1")) {
			
		System.out.println();
			
		do {
			System.out.println("Input car type [SUV | Sedan | Sport] : ");
			type = scan.nextLine();
			if(type.length() >= 3 && type.length() <= 10) {
				break;
			}
		}while(true);
		
		do {
			System.out.println("Input car model [5..15] : ");
			model = scan.nextLine();
			if(model.length() >= 5 && model.length() <= 15) {
				break;
			}
		}while(true);
		
		do {
			System.out.println("Input car problem [8..20] : ");
			problem = scan.nextLine();
			if(problem.length() >= 8 && problem.length() <= 20) {
				break;
			}
		}while(true);
		
		do {
			System.out.println("Input your name [starts with Mr. or Ms.] : ");
			name = scan.nextLine();
			if(name.startsWith("Mr.") || name.startsWith("Ms.") ) {
				break;
			}
		}while(true);
		
		do {
			System.out.println("Do you want to wash your car (Rp. 50000) [Y/N] ?");
			wash = scan.nextLine();
			if(wash.equals("Y") || wash.equals("N")) {
				break;
			}
		}while(true);
		
		System.out.println();
		System.out.println("Car Type :" + type);
		System.out.println("Car Model :" + model);
		System.out.println("Car Problem :" + problem);
		System.out.println("Customer Name :" + name);
		System.out.println("Car Wash :" + wash);
		
		}
		
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		new Main();
		

	}

}

package coffeeShop;

import java.util.Scanner;

public class Shop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to BACANAK COFFEE");
		System.out.println("What is your order ?");
		
		
		
		String coffeeName=scan.next();
		Double coffeePrice=scan.nextDouble();
		int coffeeQuantity=scan.nextInt();
		
		
		
		Coffee newCoffee=new Coffee(coffeeName,coffeePrice,coffeeQuantity);
		
		int order=scan.nextInt();
		
		
		while(order!=0) {
			System.out.println(newCoffee.getName());
			System.out.println(newCoffee.getPrice());
			System.out.println(newCoffee.getQuantity());
			
			System.out.println("Do you have anything else to order ?");
			
			if(order==0) {
				System.out.println("Alright then. Enjoy your coffee and have a nice day!");
				
				
			}
			else if(order==1) {
				System.out.println("Well then don't wait and order ;))");
				coffeeName=scan.next();
				coffeePrice=scan.nextDouble();
				coffeeQuantity=scan.nextInt();
				order=scan.nextInt();
				if(order==0) {
					System.out.println("Alright then. Enjoy your coffee and have a nice day!");
				}
				
			}
			
			
			
			
			
		}
		
		
	}

}

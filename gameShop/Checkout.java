package gameShop;
import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;

public class Checkout {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		ArrayList<games> gameList = new ArrayList();
		
		games breathOftheWild = new games();
		gameList.add(breathOftheWild);
		games skyrim = new games();
		gameList.add(skyrim);
		games Game = new games();
		
		
		
		Calendar day = Calendar.getInstance();
		Calendar saleDay = Calendar.getInstance();
		
		saleDay.set(Calendar.DAY_OF_MONTH, 27);
		saleDay.set(Calendar.YEAR, 2020);
		saleDay.set(Calendar.MONTH, 7);
		
		
		skyrim.title = "Skyrim";
		skyrim.company = "Bethesda";
		skyrim.price = 19.99;
		skyrim.sale = false;
		skyrim.stock = 1;
		
		breathOftheWild.title = "The Legend of Zelda: Breath of the Wild";
		breathOftheWild.company = "Nintendo";
		breathOftheWild.price = 59.99;
		breathOftheWild.stock = 3;
		breathOftheWild.sale = false;
		
		double wallet = 30;
		
		if(day.get(Calendar.DAY_OF_MONTH) == saleDay.get(Calendar.DAY_OF_MONTH) & day.get(Calendar.MONTH) == saleDay.get(Calendar.MONTH)) {
			skyrim.sale = true;
		}
		if(skyrim.sale == true) {
			skyrim.price = skyrim.price * .5;
		}
		
		boolean done = false;
		boolean done2 = false;
	
		
		while(done == false) {
			System.out.println("You have $" + wallet + " left.");
			System.out.println();
			System.out.println("Welcome to the gameshop, please make a selection:");
			System.out.println("1: purchase games");
			System.out.println("2: check stock");
			System.out.println("3: leave");
			String menu1 = user.nextLine();
			if(menu1.equals("1")) {
				while(done2 == false) {
					System.out.println("You have " + wallet + " left.");
					System.out.println();
					for(int i = 0; i  < gameList.size(); i++) {
						Game = gameList.get(i);
						System.out.println(Game.title);
					}
					System.out.println("Please select a game to purchase by entering its name:");
					String menu2 = user.nextLine();
					for(int i = 0; i  < gameList.size(); i++) {
						Game = gameList.get(i);
						if(menu2.equals(Game.title)) {
							wallet = wallet - Game.price;
							break;
						};
					}
//					if(menu2.equals(breathOftheWild.title)) {
//						if (wallet < breathOftheWild.price) {
//							System.out.println("Not enough money");
//						} else {
//							breathOftheWild.stock--;
//							wallet = wallet - breathOftheWild.price;							
//						}
//					} else if(menu2.equals(skyrim.title))
//						if (wallet < skyrim.price) {
//							System.out.println("Not enough money");
//						} else {
//						skyrim.stock--;
//						wallet = wallet - skyrim.price;
					if (menu2.equals("done")) {
						done2 = true;
					}
					
				}
			} else if(menu1.equals("2")) {
				System.out.println(skyrim.title + ": In stock: " + skyrim.stock);
				System.out.println(breathOftheWild.title + ": In stock: " + breathOftheWild.stock);
			} else if(menu1.equals("3")) {
				System.out.println("Have a good day!");
				break;
			}
		}
	}
}

import java.util.*;

import java.io.IOException;



public class Main {
	Scanner scan = new Scanner(System.in);
	Player player = new Player();
	HashMap<String, Items> items = readfile.createItems();
	
	
	public void Menu() {
		String input;
		do {
			System.out.println("Play 300 Years After? [Yes/No]");
			System.out.println("Case Insensitive");
			input = scan.nextLine();
			clear();
			if(input.equalsIgnoreCase("No")) {
				System.out.println("Goodbye");
				System.exit(0);;
			}else {
				play();
			}
		}while(input.equalsIgnoreCase("No"));
	}

	private void play() {
		System.out.println("The cold breeze of wind sweeps through the tiny settlement of Cembri, contrasting the sun's light as if mocking its unfelt warmth.\n"
				+ "You found your a;ready rigid finger grew colder and the sweat caused by hours of foraging is anything but helpful. \n"
				+ "Your home, Cembri is in sight and you need to make it there before the cold wind took your life away just like they took your mothers.\n"
				+ "Not wanting the tiredness and cold clouding your mind, you start to recall things about yourself such as your name. \n\n"
				+ "You are?");
		String name = scan.nextLine();
		player.Name = name;
		System.out.println("That's who you are. A name the only memento you got from your mother other than the?: [Old knive / Winter Coat / Map] she gave you");
		String memento = scan.nextLine();
		
		switch(memento.toLowerCase()) {
			case "old knive" :{
//				player.Inventory.add("Old Knive");
				break;
			}
			case "Winter Coat" :{
				
				break;
			}
			case "Map" :{
				
				break;
			}
		}
				
	}

	private void clear() {
		for(int x=0;x<10;x++) {
			System.out.println("\n");
		}
	}

	public Main() {
		Menu();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

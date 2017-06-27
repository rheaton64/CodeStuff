package Pokemon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class pBattle {
	//TODO(if possible)
	// 1. Display health in switch menu
	// 2. Code full type chart
	// 3. Give moves Attack Values
	// 4. Give Pokemon actual stats
	public static int fight = 1;
	public static int go = 1;
	public static int printPre = 1;
	public static Pkmn[] Pokemon1 = new Pkmn[3];
	public static Pkmn[] Pokemon2 = new Pkmn[3];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to Pokemon Simulator/RNG Game!");
		System.out.println("Would you like to make your own teams?");
		boolean sense = true;
		String input = scan.next();
		while(sense == true){
			if(input.equals("yes")){
				sense = false;
			}
			else if(input.equals("no")){
				fight = 3;
				System.out.println("Alright, let's use some pre-made ones!");
				sense = false;
				preMade1();
				teamPrinterPre(Pokemon1, scan);
				printPre++;
				teamPrinterPre(Pokemon2, scan);
			}
			else{
				System.out.println(input+" is not a valid input");
				input = scan.next();
			}
		}
		while(fight <  3){
			create1(scan);
			teamPrinter(Pokemon1, scan);
			while(go == 2){
				create2(scan);
				teamPrinter(Pokemon2, scan);
			}
		}
		System.out.println("Let's battle!");
		Battle(scan, rand);
	}
	public static void create1(Scanner scan){
		String[] names1 = new String[3];
		String[] types1 = new String[3];
		String[] abilities1 = new String[3];
		int[] healths1 = new int[3];
		ArrayList<String[]> moves = new ArrayList<String[]>();
		String[] p1m1 = new String[4];
		String[] p1m2 = new String[4];
		String[] p1m3 = new String[4];
		moves.add(p1m1);
		moves.add(p1m2);
		moves.add(p1m3);
		int moveCounter = 0;
		for(int p = 0;p < 3;p++){
			int print = p+1;
			System.out.println("Player 1, please enter the details for Pokemon "+print+".");
			System.out.println("Name");
			names1[p]= scan.next();
			System.out.println("Type");
			types1[p]= scan.next();
			System.out.println("Ability(doesn't actually do anything)");
			abilities1[p] = scan.next();
			System.out.println("Health");
			healths1[p] = scan.nextInt();
			for(int m = 0;m < 4;m++){
				int movePrint = m+1;
				System.out.println("Move "+movePrint);
				moves.get(moveCounter)[m] = scan.next();
			}
			Pokemon1[p] = new Pkmn(names1[p], types1[p], abilities1[p], healths1[p], moves.get(moveCounter));
			moveCounter++;
		}
	}
	public static void create2(Scanner scan){
		String[] names2 = new String[3];
		String[] types2 = new String[3];
		String[] abilities2 = new String[3];
		int[] healths2 = new int[3];
		ArrayList<String[]> moves = new ArrayList<String[]>();
		String[] p2m1 = new String[4];
		String[] p2m2 = new String[4];
		String[] p2m3 = new String[4];
		moves.add(p2m1);
		moves.add(p2m2);
		moves.add(p2m3);
		int moveCounter = 0;
		for(int p = 0;p < 3;p++){
			int print = p+1;
			System.out.println("Player 2, please enter the details for Pokemon "+print+".");
			System.out.println("Name");
			names2[p]= scan.next();
			System.out.println("Type");
			types2[p]= scan.next();
			System.out.println("Ability(doesn't actually do anything)");
			abilities2[p] = scan.next();
			System.out.println("Health");
			healths2[p] = scan.nextInt();
			for(int m = 0;m < 4;m++){
				int movePrint = m+1;
				System.out.println("Move "+movePrint);
				moves.get(moveCounter)[m] = scan.next();
			}
			Pokemon2[p] = new Pkmn(names2[p], types2[p], abilities2[p], healths2[p], moves.get(moveCounter));
			moveCounter++;
		}
	}
	public static void teamPrinter(Pkmn[] p, Scanner scan){
		boolean sense = true;
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println("That was your team, do you like it?");
		String input = scan.next();
		while(sense == true){
			if(input.equals("yes")){
				fight++;
				sense = false;
				go++;
			}
			else if(input.equals("no")){
				System.out.println("Alright, let's remake it then!");
				sense = false;
			}
			else{
				System.out.println(input+" is not a valid input");
				input = scan.next();
			}
		}
	}
	public static void teamPrinterPre(Pkmn[] p, Scanner scan){
		boolean sense = true;
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println("Player "+printPre+"'s team. Type ok to continue");
		String input = scan.next();
		while(sense == true){
			if(input.equals("ok")){
				sense = false;
			}
			else{
				System.out.println("Type ok to continue");
				input = scan.next();
			}
		}
	}
	public static void preMade1(){
		String[] moves10 = new String[4];
		moves10[0] = "Thunderbolt";
		moves10[1] = "Iron Tail";
		moves10[2] = "Quick Attack";
		moves10[3] = "Spark";
		Pokemon1[0] = new Pkmn("Pikachu", "Electric", "Static", 250, moves10);
		String[] moves11 = new String[4];
		moves11[0] = "Judgement";
		moves11[1] = "Extreme Speed";
		moves11[2] = "Hyper Beam";
		moves11[3] = "Giga Impact";
		Pokemon1[1] = new Pkmn("Arceus", "Dragon", "Multitype", 500, moves11);
		String[] moves12 = new String[4];
		moves12[0] = "Thunder";
		moves12[1] = "Brave Bird";
		moves12[2] = "Thunderbolt";
		moves12[3] = "Air Slash";
		Pokemon1[2] = new Pkmn("Zapdos", "Electric", "Pressure", 1000, moves12);
		String[] moves20 = new String[4];
		moves20[0] = "Scratch";
		moves20[1] = "Water Gun";
		moves20[2] = "Bubble";
		moves20[3] = "Quick Attack";
		Pokemon2[0] = new Pkmn("Squirtle", "Water", "Torrent", 250, moves20);
		String[] moves21 = new String[4];
		moves21[0] = "Precipice Blades";
		moves21[1] = "Earthquake";
		moves21[2] = "Fire Blast";
		moves21[3] = "Chomp";
		Pokemon2[1] = new Pkmn("Groudon", "Ground", "Drought", 500, moves21);
		String[] moves22 = new String[4];
		moves22[0] = "Psyshock";
		moves22[1] = "Psychic";
		moves22[2] = "Aura Sphere";
		moves22[3] = "Rock Slide";
		Pokemon2[2] = new Pkmn("Mega Mewtwo-Y", "Psychic", "Insomnia", 100, moves22);
	}
	//Active Pokemon
	public static int aP1 = 0;
	public static int aP2 = 0;
	//Active Pokemon's health
	public static int aP1H = 0;
	public static int aP2H = 0;
	//Turn booleans
	public static boolean turn1 = true;
	public static boolean turn2 = true;
	//1 is attacking, 2 if switching
	public static int p1Ac = 0;
	public static int p2Ac = 0;
	//Pokemon p is switching to
	public static int p1s = 0;
	public static int p2s = 0;
	//Move p is using
	public static int p1m = 0;
	public static int p2m = 0;
	//Decides who goes first
	public static int first = 0;
	//Stored health values
	public static int[] p1SH = new int[3];
	public static int[] p2SH = new int[3];
	//Check if p has lost
	public static int p1Lose = 0;
	public static int p2Lose = 0;                                                                                                                   

	//Code to run the battle sequence
	public static void Battle(Scanner scan, Random rand){
		System.out.println("Player 1, choose your starting Pokemon");
		System.out.println("1. "+Pokemon1[0].getName());
		System.out.println("2. "+Pokemon1[1].getName());
		System.out.println("3. "+Pokemon1[2].getName());
		boolean psense1 = true;
		while(psense1 == true){
			aP1  = scan.nextInt();
			if(aP1 > 3 || aP1 < 1){
				System.out.println(aP1+" is not a valid input");
			}
			else{
				psense1 = false;
			}
		}
		aP1--;
		System.out.println("Player 2, choose your starting Pokemon");
		System.out.println("1. "+Pokemon2[0].getName());
		System.out.println("2. "+Pokemon2[1].getName());
		System.out.println("3. "+Pokemon2[2].getName());
		boolean psense2 = true;
		while(psense2 == true){
			aP2  = scan.nextInt();
			if(aP2 > 3 || aP2 < 1){
				System.out.println(aP2+" is not a valid input");
			}
			else{
				psense2 = false;
			}
		}
		aP2--;
		aP1H = Pokemon1[aP1].getHealth();
		aP2H = Pokemon2[aP2].getHealth();
		for(int ph = 0;ph < 3;ph++){
			p1SH[ph] = Pokemon1[ph].getHealth();
		}
		for(int ph = 0;ph < 3;ph++){
			p2SH[ph] = Pokemon2[ph].getHealth();
		}
		while(p1Lose < 3 && p2Lose < 3){
			p1SH[aP1] = aP1H;
			p2SH[aP2] = aP2H;
			while(turn1 == true){
				bMenuPrint1();
				boolean bsense1 = true;
				while(bsense1 == true){
					int bMen1 = scan.nextInt();
					if(bMen1 == 1){
						bsense1 = false;
						fMenuPrint1();
						boolean fsense1 = true;
						while(fsense1 == true){
							int fMen1 = scan.nextInt();
							if(fMen1 > 0 && fMen1 < 5){
								p1Ac = 1;
								p1m = fMen1 - 1;
								fsense1 = false;
								turn1 = false;
							}
							else{
								System.out.println(fMen1+" is not a valid input");
							}
						}
					}
					else if(bMen1 == 2){
						bsense1 = false;
						sMenuPrint1();
						boolean ssense1 = true;
						while(ssense1 == true){
							int sMen1 = scan.nextInt();
							if(sMen1 > 0 && sMen1 < 4){
								setSwitch1(scan, sMen1);
								ssense1 = false;
								turn1 = false;
							}
							else{
								System.out.println(sMen1+" is not a valid input");
							}
						}
					}
					else{
						System.out.println(bMen1+" is not a valid input");
					}
				}
				turn1 = false;
			}
			while(turn2 == true){
				bMenuPrint2();
				boolean bsense2 = true;
				while(bsense2 == true){
					int bMen2 = scan.nextInt();
					if(bMen2 == 1){
						bsense2 = false;
						fMenuPrint2();
						boolean fsense2 = true;
						while(fsense2 == true){
							int fMen2 = scan.nextInt();
							if(fMen2 > 0 && fMen2 < 5){
								p2Ac = 1;
								p2m = fMen2 - 1;
								fsense2 = false;
								turn2 = false;
							}
							else{
								System.out.println(fMen2+" is not a valid input");
							}
						}
					}
					else if(bMen2 == 2){
						bsense2 = false;
						sMenuPrint2();
						boolean ssense2 = true;
						while(ssense2 == true){
							int sMen2 = scan.nextInt();
							if(sMen2 > 0 && sMen2 < 4){
								setSwitch2(scan, sMen2);
								ssense2 = false;
								turn2 = false;
							}
							else{
								System.out.println(sMen2+" is not a valid input");
							}
						}
					}
					else{
						System.out.println(bMen2+" is not a valid input");
					}
				}
				turn2 = false;
			}
			findActions(rand);
			if(first == 1){
				doAction1(scan, rand);
				doAction2(scan, rand);
			}
			if(first == 2){
				doAction2(scan, rand);
				doAction1(scan, rand);
			}
			turn1 = true;
			turn2 = true;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(p1Lose == 3){
			System.out.println("Player 2 wins!");
		}
		if(p2Lose == 3){
			System.out.println("Player 1 wins!");
		}
	}
	public static void bMenuPrint1(){
		System.out.println("P1-                 "+Pokemon2[aP2].getName()+" HP("+aP2H+"/"+Pokemon2[aP2].getHealth()+")");
		System.out.println(Pokemon1[aP1].getName()+" HP("+aP1H+"/"+Pokemon1[aP1].getHealth()+")");
		System.out.println("____________________");
		System.out.println("|                  ");
		System.out.println("|    1. Fight      ");
		System.out.println("|                  ");
		System.out.println("|    2. Switch     ");
		System.out.println("|                  ");
		System.out.println("|___________________");
	}
	public static void fMenuPrint1(){
		System.out.println("P1-                 "+Pokemon2[aP2].getName()+" HP("+aP2H+"/"+Pokemon2[aP2].getHealth()+")");
		System.out.println(Pokemon1[aP1].getName()+" HP("+aP1H+"/"+Pokemon1[aP1].getHealth()+")");
		System.out.println("__________________________________________________");
		System.out.println("|                  ");
		System.out.println("|    1. "+Pokemon1[aP1].getMoves()[0]+"      2. "+Pokemon1[aP1].getMoves()[1]);
		System.out.println("|                  ");
		System.out.println("|    3. "+Pokemon1[aP1].getMoves()[2]+"      4. "+Pokemon1[aP1].getMoves()[3]);
		System.out.println("|                  ");
		System.out.println("|_________________________________________________");
	}
	public static void sMenuPrint1(){
		System.out.println("P1-                 "+Pokemon2[aP2].getName()+" HP("+aP2H+"/"+Pokemon2[aP2].getHealth()+")");
		System.out.println(Pokemon1[aP1].getName()+" HP("+aP1H+"/"+Pokemon1[aP1].getHealth()+")");
		System.out.println("_________________________________");
		System.out.println("|                  ");
		System.out.println("|    1. "+Pokemon1[0].getName());
		System.out.println("|    2. "+Pokemon1[1].getName());
		System.out.println("|    3. "+Pokemon1[2].getName());
		System.out.println("|                  ");
		System.out.println("|________________________________");
	}
	public static void setSwitch1(Scanner scan, int p){
		boolean ssense = true;
		while(ssense == true){
			if(p == aP1 + 1){
				System.out.println(Pokemon1[p].getName()+" is already in battle!");
				p = scan.nextInt();
			}
			else if(p < 1 || p > 3){
				System.out.println(p+" is not a vaild input");
				p = scan.nextInt();
			}
			else{
				p1Ac = 2;
				p--;
				p1s = p;
				if(p1SH[p] <= 0){
					System.out.println(Pokemon1[p].getName()+" has fainted. Pick another Pokemon");
					p = scan.nextInt();
				}
				else{
					p1s = p;
					ssense = false;
				}
			}
		}
	}
	public static void bMenuPrint2(){
		System.out.println("P2-                 "+Pokemon1[aP1].getName()+" HP("+aP1H+"/"+Pokemon1[aP1].getHealth()+")");
		System.out.println(Pokemon2[aP2].getName()+" HP("+aP2H+"/"+Pokemon2[aP2].getHealth()+")");
		System.out.println("____________________");
		System.out.println("|                  ");
		System.out.println("|    1. Fight      ");
		System.out.println("|                  ");
		System.out.println("|    2. Switch     ");
		System.out.println("|                  ");
		System.out.println("|___________________");
	}
	public static void fMenuPrint2(){
		System.out.println("P2-                  "+Pokemon1[aP1].getName()+" HP("+aP1H+"/"+Pokemon1[aP1].getHealth()+")");
		System.out.println(Pokemon2[aP2].getName()+" HP("+aP2H+"/"+Pokemon2[aP2].getHealth()+")");
		System.out.println("__________________________________________________");
		System.out.println("|                  ");
		System.out.println("|    1. "+Pokemon2[aP2].getMoves()[0]+"      2. "+Pokemon2[aP2].getMoves()[1]);
		System.out.println("|                  ");
		System.out.println("|    3. "+Pokemon2[aP2].getMoves()[2]+"      4. "+Pokemon2[aP2].getMoves()[3]);
		System.out.println("|                  ");
		System.out.println("|_________________________________________________");
	}
	public static void sMenuPrint2(){
		System.out.println("P2-                 "+Pokemon1[aP1].getName()+" HP("+aP1H+"/"+Pokemon1[aP1].getHealth()+")");
		System.out.println(Pokemon2[aP2].getName()+" HP("+aP2H+"/"+Pokemon2[aP2].getHealth()+")");
		System.out.println("_________________________________");
		System.out.println("|                  ");
		System.out.println("|    1. "+Pokemon2[0].getName());
		System.out.println("|    2. "+Pokemon2[1].getName());
		System.out.println("|    3. "+Pokemon2[2].getName());
		System.out.println("|                  ");
		System.out.println("|________________________________");
	}
	public static void setSwitch2(Scanner scan, int p){
		boolean ssense = true;
		while(ssense == true){
			if(p == aP2 + 1){
				System.out.println(Pokemon2[p-1].getName()+" is already in battle!");
				p = scan.nextInt();
			}
			else if(p < 1 || p > 3){
				System.out.println(p+" is not a vaild input");
				p = scan.nextInt();
			}
			else{
				p2Ac = 2;
				p--;
				p2s = p;
				if(p2SH[p] <= 0){
					System.out.println(Pokemon2[p].getName()+" has fainted. Pick another Pokemon");
					p = scan.nextInt();
				}
				p2s = p;
				ssense = false;
			}
		}
	}
	public static void findActions(Random rand){
		if(p1Ac == 1 && p2Ac == 2){
			first = 2;
		}
		if(p1Ac == 2 && p2Ac == 1){
			first = 1;
		}
		if(p1Ac == 2 && p2Ac == 2){
			first = 1;
		}
		if(p1Ac == 1 && p2Ac == 1){
			int r = rand.nextInt(2);
			if(r == 0){
				first = 1;
			}
			if(r == 1){
				first = 2;
			}
			if(Pokemon1[aP1].getMoves()[p1m].equals("Extreme Speed") || Pokemon1[aP1].getMoves()[p1m].equals("Quick Attack")){
				first = 1;
			}
			if(Pokemon2[aP2].getMoves()[p2m].equals("Extreme Speed") || Pokemon2[aP2].getMoves()[p2m].equals("Quick Attack")){
				first = 2;
			}
		}
	}
	public static void doAction1(Scanner scan, Random rand){
		if(p1Ac == 1){
			int av = rand.nextInt(101);
			System.out.println(Pokemon1[aP1].getName()+", use "+Pokemon1[aP1].getMoves()[p1m]+"!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Pokemon1[aP1].getMoves()[p1m]+" did "+av+" damage!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			aP2H = aP2H - av;
			if(aP2H <= 0){
				aP2H = 0;
				p2Lose++;
				p2SH[aP2] = aP2H;
				boolean cont = true;
				if(p2Lose == 3){
					cont = false;
					p2Ac = 3;
				}
				if(cont == true){
					System.out.println(Pokemon2[aP2].getName()+" has fainted. Player 2, please pick another Pokemon");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(first == 1){
						sMenuPrint2();
						deadSwitch2(scan);
						p2Ac = 2;

					}
					if(first == 2){
						sMenuPrint2();
						deadSwitch2(scan);;
						aP2 = p2s;
						aP2H = p2SH[aP2];
						System.out.println("Go, "+Pokemon2[aP2].getName()+"!");
					}
				}
			}
		}
		if(p1Ac == 2){
			aP1 = p1s;
			aP1H = p1SH[aP1];
			System.out.println("Go, "+Pokemon1[aP1].getName()+"!");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void deadSwitch1(Scanner scan){
		int p = scan.nextInt();
		boolean ssense = true;
		while(ssense == true){
			if(p1Lose == 3){
				ssense = false;
			}
			else if(p == aP1 + 1){
				System.out.println(Pokemon1[p-1].getName()+" is already in battle!");
				p = scan.nextInt();
			}
			else if(p < 1 || p > 3){
				System.out.println(p+" is not a vaild input");
				p = scan.nextInt();
			}
			else{
				p1Ac = 2;
				p--;
				p1s = p;
				if(p1SH[p] <= 0){
					System.out.println(Pokemon1[p].getName()+" has fainted. Pick another Pokemon");
					p = scan.nextInt();
				}
				else{
					p1s = p;
					ssense = false;
				}
			}
		}
	}
	public static void doAction2(Scanner scan, Random rand){
		if(p2Ac == 1){
			int av = rand.nextInt(101);
			System.out.println(Pokemon2[aP2].getName()+", use "+Pokemon2[aP2].getMoves()[p2m]+"!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Pokemon2[aP2].getMoves()[p2m]+" did "+av+" damage!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			aP1H = aP1H - av;
			if(aP1H <= 0){
				aP1H = 0;
				p1Lose++;
				p1SH[aP1] = aP1H;
				boolean cont = true;
				if(p1Lose == 3){
					cont = false;
					p1Ac = 3;
				}
				if(cont == true){
					System.out.println(Pokemon1[aP1].getName()+" has fainted. Player 1, please pick another Pokemon");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(first == 2){
						sMenuPrint1();
						deadSwitch1(scan);
						p1Ac = 2;

					}
					if(first == 1){
						sMenuPrint1();
						deadSwitch1(scan);
						aP1 = p1s;
						aP1H = p1SH[aP1];
						System.out.println("Go, "+Pokemon1[aP1].getName()+"!");
					}
				}
			}
		}
		if(p2Ac == 2){
			aP2 = p2s;
			aP2H = p2SH[aP2];
			System.out.println("Go, "+Pokemon2[aP2].getName()+"!");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void deadSwitch2(Scanner scan){
		int p = scan.nextInt();
		boolean ssense = true;
		while(ssense == true){
			if(p == aP2 + 1){
				System.out.println(Pokemon2[p-1].getName()+" is already in battle!");
				p = scan.nextInt();
			}
			else if(p < 1 || p > 3){
				System.out.println(p+" is not a vaild input");
				p = scan.nextInt();
			}
			else{
				p2Ac = 2;
				p--;
				p2s = p;
				if(p2SH[p] <= 0){
					System.out.println(Pokemon2[p].getName()+" has fainted. Pick another Pokemon");
					p = scan.nextInt();
				}
				else{
					p2s = p;
					ssense = false;
				}
			}
		}
	}
}
package Jerry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class run {
	static ArrayList<String> codes = new ArrayList<String>();
	static ArrayList<String> scores = new ArrayList<String>();
	static ArrayList<Contractor> contractors = new ArrayList<Contractor>();
	static BufferedReader cReader;
	static BufferedReader sReader;
	static boolean newCont = true;
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		//Creating BufferedReaders
		File codesFile = new File("src/Jerry/Contractor Zip Codes.xlsx - Sheet1.csv");
		File scoresFile = new File("src/Jerry/contractor_reportcard.xls - Worksheet1.csv");
		//Scanning files
		try {
			
			cReader = new BufferedReader(new FileReader(codesFile));
			sReader = new BufferedReader(new FileReader(scoresFile));
			String cScanner = "";
			while ((cScanner = cReader.readLine()) != null){
				codes.add(cScanner);
			}
			String sScanner = "";
			while ((sScanner = sReader.readLine()) != null){
				scores.add(sScanner);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Creating contractors and giving them zip codes
		for(int i = 0; i < codes.size(); i++){
			if(codes.get(i).startsWith("Contractor")){

			}
			else {
				if(contractors.size() == 0){
					Contractor c = new Contractor();
					c.setName(codes.get(i).substring(0, codes.get(i).indexOf(",")));
					c.addCode(Integer.parseInt(codes.get(i).substring(codes.get(i).indexOf(",")+1)));
					contractors.add(c);
				}
				else {
					for(int c = 0; c < contractors.size(); c++){
						if(contractors.get(c).getName().equals(codes.get(i).substring(0, codes.get(i).indexOf(",")))){
							contractors.get(c).addCode(Integer.parseInt(codes.get(i).substring(codes.get(i).indexOf(",")+1)));
							newCont = false;
						}
					}
					if(newCont == true){
						Contractor c1 = new Contractor();
						c1.setName(codes.get(i).substring(0, codes.get(i).indexOf(",")));
						c1.addCode(Integer.parseInt(codes.get(i).substring(codes.get(i).indexOf(",")+1)));
						contractors.add(c1);
					}
				}
			}
			newCont = true;
		}
		//Giving contractors scores
		for(int i = 0; i < scores.size(); i++){
			if (scores.get(i).startsWith(",")){
				for(int c = 0; c < contractors.size(); c++){
					if(scores.get(i-1).substring(scores.get(i-1).indexOf(",")+1, scores.get(i-1).indexOf(",", scores.get(i-1).indexOf(",")+1)).equals(contractors.get(c).getName())){
						String num = scores.get(i).substring(scores.get(i).indexOf(" ")+1, scores.get(i).indexOf("%"));
						int score = Integer.parseInt(num);
						contractors.get(c).setScore(score);
					}
				}
			}
		}
		//Run the prompt
		boolean go = true;
		while(go == true){
			ArrayList<Contractor> cont = new ArrayList<Contractor>();
			System.out.println("Enter zip code");
			int zip = scan.nextInt();
			for(int c = 0; c < contractors.size(); c++){
				for(int n = 0; n < contractors.get(c).getCodes().size(); n++){
					if(contractors.get(c).getCodes().get(n) == zip){
						cont.add(contractors.get(c));
					}
				}
			}
			if(cont.size() != 0){
				Collections.sort(cont, new Sortbyscore());
				Collections.reverse(cont);
				System.out.println();
				System.out.println("Recommended contractor: ");
				System.out.println(cont.get(0));
				if(cont.size() > 1){
					System.out.println();
					System.out.println("Other contractors:");
					for(int i = 1; i < cont.size(); i++){
						System.out.println(cont.get(i));
					}
				}
			}
			else{
				System.out.println();
				System.out.println("No contractors found in that zip code");
			}
			System.out.println();
		}
	}
}


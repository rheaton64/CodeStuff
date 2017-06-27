package Pokemon;

public class Pkmn {
	private String name;
	private String type;
	private String ability;
	private int health;
	private String[] moves = new String[4];
	
	public Pkmn(String name1, String type1, String ability1, int health1, String[] moves1){
		name = name1;
		type = type1;
		ability = ability1;
		health = health1;
		moves = moves1;
	}
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public String getAbility(){
		return ability;
	}
	public int getHealth(){
		return health;
	}
	public String[] getMoves(){
		return moves;
	}
	public String toString(){
		return(name+": "+type+" Type - Ability: "+ability+" - HP: "+health+" - Moves: "+moves[0]+", "+moves[1]+", "+moves[2]+", "+moves[3]+".");
	}
}

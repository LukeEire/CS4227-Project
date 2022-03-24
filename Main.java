
public class Main {

	Memento saveState = new Memento();
	static Player player = new Player();
	static Map map;
	
	public static void main(String[] args) {
		//Needs to generate map and rooms accordingly 
		//Generates player object before starting game
		
		
	}

	private static void restoreState(Memento m) {
		m.restoreState(player, map);
		//This should be all the relevant data needed to restore the game state to the required point
	}

}


public class Memento {

	Player playerSave;
	Map mapSave;
	
	
	public void restoreState(Player p, Map m) {
		p = playerSave;
		m = mapSave;
	}
	
	public void savePLayer(Player p) {
		playerSave = p;
	}
	
	public void saveMap(Map m) {
		mapSave = m;
	}
	
}

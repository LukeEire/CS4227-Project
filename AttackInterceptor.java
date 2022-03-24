
public class AttackInterceptor {

	public void playerAtkBuff(Player p, Enemy e) {
		int attackStrength = p.attack;
		
		if(p.inventory.size() > 0) {
			for(int i = 0; i < p.inventory.size(); i++) {
				//This can be changed based on how Ayoub implements Items
				attackStrength += p.inventory.get(i);
			}
		}
		
		e.health -= attackStrength;
		
	}
	
	
	
	
	
}

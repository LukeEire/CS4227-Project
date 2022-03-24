import java.util.ArrayList;

public class Player {
	int health;
	int stamina;
	int attackStat;
	int currentRoom;
	String status;
	ArrayList<Integer> inventory = new ArrayList<>();
	AttackInterceptor attack = new AttackInterceptor();
	
	public void attack(Enemy e) {
		attack.playerAtk(this, e);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

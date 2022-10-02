
public class Main {

	public static void main(String[] args) {
		Player p1 = new Player("Emre",1);
		System.out.println(p1.name);
		
		System.out.println(Player.game);          // static işaretlenen öğelerde nesne oluşturmak dahi gerekmez. Hafızaya işlenmiştir.
		
		User user1 = new User("Ali",1);
		User user2 = new User("Emre",2);
		User user3 = new User("Mehmet",3);
		
		
	}

}

package hulkthorthreading;

public class WarriorApp {
public static void main(String[] args) {
	Warrior w = new Warrior();
	Thread t1 = new Thread(w);
	Thread t2 = new Thread(w);
	t1.setName("THOR");
	t2.setName("HULK");
	t1.start();
	t2.start();
}
}

public class Minion {

// Instance variables
	private int att;
	private int hp;
	private String entranceQuote;
	private String attackQuote;
	private String deathQuote;
	
// Constructor
	public Minion(int a, int h, String entQ, String attQ, String dQ) {
		att = a;
		hp = h;
		entranceQuote = entQ;
		attackQuote = attQ;
		deathQuote = dQ;
	}
	
// Getter method for att
	public int getAtt() {
		return att;
	}
	
// Getter method for hp
	public int getHP() {
		return hp;
	}

// Getter method for entranceQuote
	public String getEntranceQuote() {
		return entranceQuote;
	}
	
// Getter method for attackQuote
	public String getAttackQuote() {
		return attackQuote;
	}
	
// Getter method for deathQuote
	public String getDeathQuote() {
		return deathQuote;
	}
	
// Verifies if a minion is alive
	public boolean isAlive() {
		if (this.getHP() > 0) {
			return true;
		} else {
			return false;
		}
	}

// Method which plays a minion onto the field
	public void play() {
		System.out.println(this.getEntranceQuote());
	}

// Method which makes a minion attack another minion
	public void attack(Minion a) {
		System.out.println(this.getAttackQuote());
		
		a.changeHP(this.getAtt());
		this.changeHP(a.getAtt());
		
		if (!a.isAlive()) {
			System.out.println(a.getDeathQuote());
		}
		if (!this.isAlive()) {
			System.out.println(this.getDeathQuote());
		}
	}

// Changer method for hp
	private void changeHP(int delta) {
		hp -= delta;
	}
		
	
// Main method
	public static void main(String[] args) {
	Minion patches = new Minion(1,1,"I'M IN CHARGE NOW","AYE AYE","SLURRRP");
	Minion magmaRager = new Minion(5,1,"RAAUGH","RAUGH","RAUUUGH");
	
	patches.play();
	magmaRager.play();
	
	patches.attack(magmaRager);
	
	}
}
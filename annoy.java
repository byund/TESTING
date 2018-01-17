public class annoy {

// Instance variables
	private int att;
	private int hp;
	private boolean taunt;
	private boolean divineShield;
	
// Constructor
	public annoy() {
		att = 1;
		hp = 2;
		taunt = true;
		divineShield = true;
		
	}
	
// Getter method for att
	public int getAtt() {
		return att;
	}
	
// Getter method for hp
	public int getHP() {
		return hp;
	}
	
// Getter method for taunt
	public boolean hasTaunt() {
		return taunt;
	}
	
// Getter method for divineShield
	public boolean hasDivineShield() {
		return divineShield;
	}
	
// Getter method for alive
	public boolean isAlive() {
		if (this.getHP() > 0) {
			return true;
		} else {
			return false;
		}
	}

// Changer method for hp
	public void changeHP(int delta) {
		hp -= delta;
	}

// Method which returns a string representing what annoy says upon entering the board.
	public String entranceQuote() {
		return "HELLO! HELLO! HELLO!";
	}
	
// Method which returns the quote upon attacking
	public String attackQuote() {
		return "AWAY!";
	}
	
// Method which returns the quote death
	public String deathQuote() {
		return "HELL OH!";
	}
	
// Method
	public void attack(annoy a) {
		System.out.println(this.attackQuote());
		
		a.changeHP(this.getAtt());
		this.changeHP(a.getAtt());
		
		if (!a.isAlive()) {
			System.out.println(a.deathQuote());
		}
		if (!this.isAlive()) {
			System.out.println(this.deathQuote());
		}
	}
		
	
// Main method
	public static void main(String[] args) {
	annoy patches = new annoy();
	annoy magmaRager = new annoy();
	
	patches.attack(magmaRager);
	magmaRager.attack(patches);
	
	}
}
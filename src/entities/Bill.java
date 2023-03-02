package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double feeding() {
		return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
	}

	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		} 
		else {
			return 4.0;
		}
	}

	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		} 
		else {
			return 10.0;
		}
	}

	public double total() {
		if (feeding() > 30.0) {
			return feeding() + ticket();
		} 
		else {
			return feeding() + ticket() + cover();
		}
	}

	public String toString() {
		int minFeeding = 30;
		if (feeding() > minFeeding) {
			return ("Isento de Couvert");
		} 
		else {
			return "Couvert = R$ " + String.format("%.2f", cover());
		}

	}

}

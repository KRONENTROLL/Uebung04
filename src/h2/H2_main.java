package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x = false, y = false, a = false, b = false, c = false;
		int input = 10;
		
		switch (input) {
		
		case 0:
			x = false;
			y = false;
			break;
			
		case 1:
			x = false;
			y = true;
			break;
			
		case 10:
			x = true;
			y = false;
			break;
			
		case 11:
			x = true;
			y = true;
			break;
		}
		
		if (x == true) {
			if (y == true) {
				a = true;
			}	
			else {
				a = false;
			}
		}
		else {
			a = false;
		}
		
		if (x == true) {
			b = true;
		}
		
		if (x ^ y) {
			b = true;
		}
		
		if (x == y) {
			if (x = false) {
				b = false;
			}
		}
		
		if (x && y) {
			c = false;
		}
		
		if (x || b) {
			c = true;
		}
		
		if (x == y) {
			c = true;
		}
		
		System.out.println("Input: " + input);
		System.out.println("X: " +  x);
		System.out.println("Y: " + y);
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
	}
}

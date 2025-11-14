package h3;

public class H3_main {
	public static void main(String[] args) {
		float celsiusFloat = 14.2f, fahrenheitFloat = 0f;
		double celsiusDouble = 14.2d, fahrenheitDouble = 0d;
		
		fahrenheitFloat = celsiusFloat * (9f / 5f) + 32;
		fahrenheitDouble = celsiusDouble * (9f / 5f) + 32;
		
		System.out.println("fahrenheitFloat: " + fahrenheitFloat);
		System.out.println("fahrenheitDouble: " + fahrenheitDouble);		
	}
}

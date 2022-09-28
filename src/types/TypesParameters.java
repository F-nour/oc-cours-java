package types;

public class TypesParameters {

	public static void main(String[] args) {
		perimeterConsole();
		perimeterValue(4, 6);
		System.out.println(sum(54, 48));
		int sum = sum(54, 48);
		System.out.println(sum);
	}
	
	public static void perimeterConsole() {
		int perimeter = 2*(4 + 6);
		System.out.println(perimeter); 
	}
	
	public static void perimeterValue(int a, int b) {
		int perimeter = 2*(a + b);
		System.out.println(perimeter); 

	}
	
	public static int sumVariable(int a, int b) {
		int calc = a + b;
		return calc;
	}

	public static int sum(int a, int b) {
		return a + b;
	}

}

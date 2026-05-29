package testing;

public class calculator {
	public calculator() {
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return  a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public int modulo(int a, int b) {
		return a % b;
	}
	
	public static void main(String[] args) {
		calculator myCalculator = new calculator();
		
		System.out.println(myCalculator.add(5, 7));
		System.out.println(myCalculator.subtract(45, 11));
	}
}

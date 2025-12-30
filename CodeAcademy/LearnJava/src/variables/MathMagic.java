package variables;

public class MathMagic {
	
	public static void main(String[] args) {
		
		// This is the original number
		
		int myNumber = 12;
		
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
		
		// Should result in 3 every time
		System.out.println(stepSix);
	}
}

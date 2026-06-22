package testing;

public class FizzBuzz {
	public static void main(String[] args) {

	    for (int i = 1; i < 101; i++) {
	      String value = "";
	      if (i % 3 == 0 && i % 5 == 0) {
	        value = "FizzBuzz";
	        System.out.println(value);
	      } else if (i % 3 == 0) {
	        value = "Fizz";
	        System.out.println(value);
	      } else if (i % 5 == 0) {
	        value = "Buzz";
	        System.out.println(value);
	      } else {
	        System.out.println(i);
	      }
	    }
	  }
}

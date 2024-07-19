package firstproject;

public class Greatestoffive {
	 public static void main(String[] args) {
	        // Predefined values for five numbers
	        int num1 = 25;
	        int num2 = 10;
	        int num3 = 40;
	        int num4 = 15;
	        int num5 = 30;

	        // Find the greatest number among the five numbers
	        int greatestNumber = findGreatestNumber(num1, num2, num3, num4, num5);

	        // Output the result
	        System.out.println("The greatest number among " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", and " + num5 + " is: " + greatestNumber);
	    }

	    // Method to find the greatest number among five numbers
	    public static int findGreatestNumber(int num1, int num2, int num3, int num4, int num5) {
	        int greatest = num1;

	        if (num2 > greatest) {
	            greatest = num2;
	        }
	        if (num3 > greatest) {
	            greatest = num3;
	        }
	        if (num4 > greatest) {
	            greatest = num4;
	        }
	        if (num5 > greatest) {
	            greatest = num5;
	        }

	        return greatest;
	    }
	}



package firstproject;

public class Triangle {

	    public static void main(String[] args) {
	        // Predefined values for angles (in degrees)
	        int angle1 = 60;
	        int angle2 = 70;
	        int angle3 = 50;

	        // Check if the angles form a triangle
	        boolean isTriangle = isTriangle(angle1, angle2, angle3);

	        // Output the result
	        if (isTriangle) {
	            System.out.println("The angles " + angle1 + ", " + angle2 + ", and " + angle3 + " form a triangle.");
	        } else {
	            System.out.println("The angles " + angle1 + ", " + angle2 + ", and " + angle3 + " do not form a triangle.");
	        }
	    }

	    // Method to check if three angles form a triangle
	    public static boolean isTriangle(int angle1, int angle2, int angle3) {
	        // Calculate the sum of angles
	        int sum = angle1 + angle2 + angle3;

	        // Check if the sum is exactly 180 degrees
	        return sum == 180;
	    }
	}



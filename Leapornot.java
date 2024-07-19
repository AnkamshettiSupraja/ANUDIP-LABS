package firstproject;

public class Leapornot {

    public static void main(String[] args) {
        // Test cases
        int year1 = 2020;
        int year2 = 2021;
        int year3 = 2000;
        int year4 = 1900;

        // Check if each year is a leap year
        System.out.println(year1 + " is a leap year? " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year? " + isLeapYear(year2));
        System.out.println(year3 + " is a leap year? " + isLeapYear(year3));
        System.out.println(year4 + " is a leap year? " + isLeapYear(year4));
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}


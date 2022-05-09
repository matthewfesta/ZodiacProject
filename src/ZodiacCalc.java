import java.util.Scanner;

/** This class takes an input for the month number and day number and  calculates
 * the correct Zodiac sign.
 *  @mfesta
 */

public class ZodiacCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Zodiac Sign Calculator");
        System.out.println("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Enter the date of the month (1-31): ");
        int day = scanner.nextInt();

        // Print the results of the Zodiac Calculation method only because debugFlag is false.
        boolean debugFlag = false;
        if (debugFlag) {
            System.out.printf("The user entered \"%d\" as the month\n", month);
            System.out.printf("The user entered \"%d\" as the day of the month\n", day);
            calcZodiac(month, day);
        } else {
            calcZodiac(month, day);
        }

    }
    /**
     * This method calculates the correct Zodiac Sign according to month and day
     * @param month
     * @param day
     */
    public static void calcZodiac(int month, int day) {
        // Calculate the correct zodiac sign
        if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
            System.out.println("The Zodiac sign is: Aries");
        } else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
            System.out.println("The Zodiac sign is: Taurus");
        } else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("The Zodiac sign is: Gemini");
        } else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            System.out.println("The Zodiac sign is: Cancer");
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
            System.out.println("The Zodiac sign is: Leo");
        } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
            System.out.println("The Zodiac sign is: Virgo");
        } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
            System.out.println("The Zodiac sign is: Libra");
        } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
            System.out.println("The Zodiac sign is: Scorpio");
        } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
            System.out.println("The Zodiac sign is: Sagittarius");
        } else if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
            System.out.println("The Zodiac sign is: Capricorn");
        } else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 18)) {
            System.out.println("The Zodiac sign is: Aquarius");
        } else if ((month == 2 && day >= 19 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) {
            System.out.println("The Zodiac sign is: Pisces");
        } else {
            isValid(month, day);
        }
    }
    /**
     * This method detects if a valid month or day was inputted by the user.
     * @param month
     * @param day
     */
    public static void isValid(int month, int day) {
        // Decide if month is invalid
        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
            // Decide if the date is invalid
        } else if ((month == 1) || (month == 3) || (month == 5) || (month == 7)
                || (month == 8) || (month == 10) || (month == 12) && (day < 1 || day > 31)) {
            System.out.println("Invalid calendar date");
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day < 1 || day > 30)) {
            System.out.println("Invalid calendar date");
        } else if ((month == 2) && (day < 1 || day > 29)) {
            System.out.println("Invalid calendar date");
        }
    }


}

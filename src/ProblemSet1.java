/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double LENGTH = 8.5;
         final double WIDTH = 11;
         final double CONVERSION_IN_MM = 25.4;
         double lengthMillimeters = LENGTH * CONVERSION_IN_MM;
         double widthMillimeters = WIDTH * CONVERSION_IN_MM;
         double squareMillimeters = lengthMillimeters * widthMillimeters;
         System.out.printf("\n%,.2f square millimeters.", squareMillimeters);

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double CONVERSION_IN_CM = 2.54;
         double lengthCentimeters = LENGTH * CONVERSION_IN_CM;
         double widthCentimeters = WIDTH * CONVERSION_IN_CM;
         double perimeterCentimeters = (widthCentimeters * 2) + (lengthCentimeters * 2);
         System.out.printf("\n\n%.2f centimeters.", perimeterCentimeters);

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double lengthSquared = LENGTH * LENGTH;
         double widthSquared = WIDTH * WIDTH;
         double diagonalSquared = lengthSquared + widthSquared;
         double diagonal = Math.round(java.lang.Math.sqrt(diagonalSquared) * 100.0) / 100.0;
         System.out.printf("\n\n%.2f inches", diagonal);

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        final double WEIGHT_HOMEWORK = .15;
        final double WEIGHT_QUIZ = .35;
        final double WEIGHT_TEST = .50;
        double homeworkGrade = (homework1 + homework2 + homework3) * WEIGHT_HOMEWORK / 3;
        double quizGrade = (quiz1 + quiz2 + quiz3) * WEIGHT_QUIZ / 3;
        double testGrade = (test1 + test2 + test3) * WEIGHT_TEST / 3;
        double total = (homeworkGrade + quizGrade + testGrade);

        System.out.printf("\n\n%.2f%%", total);


        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

        final double WAGE_HOURLY = 12.50;

        double hoursMon = 7.5;
        double hoursTues = 8;
        double hoursWed = 10.5;
        double hoursThurs = 9.5;
        double hoursFri = 6;
        double hoursSat = 11.5;
        double hoursSun = 0;
        double hoursTotal = hoursMon + hoursTues + hoursWed + hoursThurs + hoursFri + hoursSat + hoursSun;

        double paycheck = WAGE_HOURLY * hoursTotal;

        System.out.printf("\n\n$%.2f.", paycheck);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

        final double TAX_FEDERAL = .24;
        final double TAX_STATE = .0637;
        final double TAX_CONTRIBUTION = .07;
        final double SALARY = 117000 / 24;

        double finalPay = SALARY * (1 - TAX_FEDERAL) * (1 - TAX_STATE) * (1 - TAX_CONTRIBUTION);

        System.out.printf("\n\n$%,.2f.", finalPay);

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         final double STUDENTS = 273;
         final double TEACHERS = 28;
         final double CAPACITY = 54;

         double numOfBuses = (STUDENTS / CAPACITY) + 1;
         double remaining = (STUDENTS % CAPACITY) + TEACHERS;
         System.out.printf("\n\n%.0f buses are needed, ", numOfBuses);
         System.out.printf("with %.0f passangers on the last bus.", remaining);

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

        final double BOARD_LENGTH = 48;
        final double BOARD_WIDTH = 24;
        final double BOARD_DIAMETER = 6;

        double holeArea = Math.PI * ((BOARD_DIAMETER / 2) * (BOARD_DIAMETER / 2));
        double surfaceArea = (BOARD_LENGTH * BOARD_WIDTH) - holeArea;
        System.out.printf("\n\n%,.2f square inches.", surfaceArea);

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

        // int year = 2020;
        // boolean isLeapYear = ((year / 4) == 0) && (((year / 100) != 0) || (year / 400) == 0);
        // System.out.println(isLeapYear);

        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

         double t = 38;
         double v = 14;

         double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
         System.out.printf("\n\n%.1f degrees.", windChill);
    }
}

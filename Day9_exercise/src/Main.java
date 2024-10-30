/*
Author: Ahmed Essam Taj
Date: 30, October
Day 9 Exercise

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);

/*
        Q1 / Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
two numbers , takes two numbers as input

 */
        // ===== answer Q1 ==============

        userPrompt();


 /*
        Q2 / Write a Java program that takes a number as input and prints its multiplication table up to 10

 */
        // ===== answer Q2 ==============
        int multiplier = -1;
        while (true) {
            System.out.println("=========== Q2 ===============");
            System.out.println("Please enter number : ");
            try {
                multiplier = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number : ");
                scanner.nextLine();
                continue;
            }
            break;
        }

        for (int i = 1; i < 11; i++) {
            System.out.println(multiplier+" * "+i+" = "+(multiplier*i));
        }

/*
        Q3 / Write a Java program to print the area and perimeter of a circle.

 */
        // ===== answer Q3 ==============
        double radius = -1;
        while (true) {
            System.out.println("=========== Q3 ===============");
            System.out.println("please enter the Radius of the circle: ");

            try {
                radius = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number : ");
                scanner.nextLine();
                continue;
            }
            break;
        }

        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter is = "+perimeter);
        double area = Math.PI*Math.pow(radius, 2);
        System.out.println("Area is = "+area);

/*
        Q4 / Java program to find out the average of a set of integers

 */
        // ===== answer Q4 ==============
        int numbersCount =-1;
        while (true) {
            System.out.println("=========== Q4 ===============");
            System.out.println("enter the count of numbers: ");

            try {
                numbersCount = scanner.nextInt();
                if (numbersCount <= 0) {
                    throw new IllegalArgumentException("Please enter a positive number");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a integer that is > 0: ");
                scanner.nextLine();
                continue;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
                continue;
            }
            break;
        }

        try {
          double avg = calculateAvg (numbersCount);
            System.out.println("The average is " + avg);
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            scanner.nextLine();
        }



/*
        Q5 / Write a Java program that accepts three integers as input, adds the first two integers
together, and then determines whether the sum is equal to the third integer

 */
        // ===== answer Q5 ==============
        int firstNumber = -1;
        int secondNumber =-1;
        int thirdNumber = -1;
        while (true) {
            System.out.println("=========== Q5 ===============");

            try {
                System.out.println("Input the first number : ");
                firstNumber = scanner.nextInt();
                System.out.println("Input the second number : ");
                secondNumber = scanner.nextInt();
                System.out.println("Input the third number : ");
                thirdNumber = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a number : ");
                scanner.nextLine();
                continue;
            }
            break;

        }
        boolean result = firstNumber + secondNumber == thirdNumber;
        System.out.println("The result is: "+result);


/*
        Q6 / Write a Java program to reverse a word.

 */
        // ===== answer Q6 ==============
        System.out.println("=========== Q6 ===============");
        System.out.println("Input a word: ");
        scanner.nextLine();
        String word = scanner.nextLine();
        String reversedWord = "";

        for (int i = word.length(); i > 0; i--) {
            char ch = word.charAt(i - 1);
            reversedWord += ch;
        }
        System.out.println("Reverse word: "+reversedWord);

/*
        Q7 / Java program to check whether the given number is even or odd

 */
        // ===== answer Q7 ==============
        int number=-1;
        while (true) {
            System.out.println("=========== Q7 ===============");
            try {
                System.out.println("Enter a number: ");

                 number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number : ");
                scanner.nextLine();
                continue;
            }
            break;
        }

            if (number % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }



/*
        Q8 / Java program to convert the temperature in Centigrade to Fahrenheit

 */
        // ===== answer Q8 ==============
        double temperature = -1;
        try {
            System.out.println("=========== Q8 ===============");
            System.out.println("Enter temperature in Centigrade: ");
            temperature = scanner.nextDouble();
            temperature = (1.8 * temperature) + 32;
            System.out.println("Temperature in Fahrenheit is: "+temperature);

        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }


/*
        Q9 / Write a Java program that takes a string and a number from the user,then prints the
character in the given index

 */
        // ===== answer Q9 ==============
        System.out.println("=========== Q9 ===============");
        scanner.nextLine();
        System.out.println("Input a string: ");
        String string = scanner.nextLine();
        try {
            System.out.println("Input a number: ");
            int charNumber = scanner.nextInt();
            System.out.println(string.charAt(charNumber));
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }



/*
        Q10 / Write a Java program to print the area and perimeter of a rectangle.

 */
        // ===== answer Q10 ==============
        scanner.nextLine();
        try {
            System.out.println("=========== Q10 ===============");
            System.out.println("Width = ");
            double width = scanner.nextDouble();
            System.out.println("Height = ");
            double height = scanner.nextDouble();

            System.out.println("Area is "+width+" * "+height+" = "+(width*height));
            System.out.println("Perimeter is 2 * ("+width+" + "+height+") = "+(2*(width+height)) );
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }


/*
        Q11 / Write a Java program to compare two numbers.

 */
        // ===== answer Q11 ==============
        scanner.nextLine();
        try {
            System.out.println("=========== Q11 ===============");
            System.out.println("Input first integer: ");
            int firstInt = scanner.nextInt();
            System.out.println("Input second integer: ");
            int secondInt = scanner.nextInt();

            if (firstInt != secondInt) {
                System.out.println(firstInt+" != "+secondInt);
                if (firstInt < secondInt) {
                    System.out.println(firstInt+" < "+secondInt);
                    System.out.println(firstInt+" <= "+secondInt);
                }else {
                    System.out.println(firstInt+" > "+secondInt);
                    System.out.println(firstInt+" >= "+secondInt);
                }
            }
            else{
                System.out.println(firstInt+" == "+secondInt);
            }
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }


/*
        Q12 / Write a Java program to convert seconds to hours, minutes and seconds.

 */
        // ===== answer Q12 ==============
        scanner.nextLine();
        try {
            System.out.println("=========== Q12 ===============");
            System.out.println("Input seconds: ");
            int inputSeconds = scanner.nextInt();
            int totalHours = inputSeconds/3600;
            int totalMinutes = inputSeconds % 3600/60;
            int totalseconds = inputSeconds % 60 ;
            System.out.println(totalHours+":"+totalMinutes+":"+totalseconds);
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }





/*
        Q13 / Write a Java program that accepts four integers from the user and prints equal if all
four are equal, and not equal otherwise.

 */
        // ===== answer Q13 ==============
        scanner.nextLine();
        try {
            System.out.println("=========== Q13 ===============");
            System.out.println("Input first number: ");
            int inputFirstNumber = scanner.nextInt();
            System.out.println("Input second number: ");
            int inputSecondNumber = scanner.nextInt();
            System.out.println("Input third number: ");
            int inputThirdNumber = scanner.nextInt();
            System.out.println("Input fourth number: ");
            int inputFourthNumber = scanner.nextInt();

            if (inputFirstNumber == inputSecondNumber && inputSecondNumber == inputThirdNumber && inputThirdNumber
                    == inputFourthNumber) {
                System.out.println("Numbers are equal!");
            }else {
                System.out.println("Numbers are not equal!");


            }
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }


 /*
        Q14 / Write a Java program that reads an integer and check whether it is negative, zero, or
positive.

 */
        // ===== answer Q14 ==============
        scanner.nextLine();
        try {
            System.out.println("=========== Q14 ===============");
            System.out.println("Enter an integer: ");
            int inputNumber = scanner.nextInt();
            if (inputNumber >0) {
                System.out.println("Number is positive");
            }else if (inputNumber <0) {
                System.out.println("Number is negative");
            }else {
                System.out.println("Number is zero");
            }
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }

/*
        Q15 / Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered (End loop use -1 ,
Don’t count -1).

 */
        // ===== answer Q15 ==============
        System.out.println("=========== Q15 ===============");
        scanner.nextLine();
        int zerosCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int inputQ15=0;
        try {
            while (inputQ15 != -1) {
                System.out.println("Enter an integer: or -1 to exit ");
                inputQ15 = scanner.nextInt();
                if (inputQ15 > 0) {
                    positiveCount++;
                } else if (inputQ15 < 0 && inputQ15 != -1) {
                    negativeCount++;
                } else if (inputQ15 == 0) {
                    zerosCount++;
                }

            }

            System.out.println("Number of positive numbers: "+positiveCount);
            System.out.println("Number of negative numbers: "+negativeCount);
            System.out.println("Number of zero numbers: "+zerosCount);
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }


/*
        Q16 /  Write a program that prompts the user to input an integer and then outputs the
number with the digits reversed.

 */
        // ===== answer Q16 ==============
        scanner.nextLine();
        try {
            System.out.println("=========== Q16 ===============");
            System.out.println("Enter a number:  ");
            int inputQ16 = scanner.nextInt();

            int reversedInt =0;
            int tempInt;
            while (inputQ16 != 0){

                tempInt = inputQ16 % 10;
                reversedInt = reversedInt * 10 + tempInt;

                inputQ16 = inputQ16 / 10;

            }

            System.out.println(reversedInt);

        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }

     /*
        Q17 /  Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered.

 */
        // ===== answer Q17 ==============
        scanner.nextLine();
        try {
            System.out.println("=========== Q17 ===============");
            System.out.println("enter the count: ");
            int inputCount = scanner.nextInt();
            int smallest = 0;
            int largest = 0;
            for (int i = 0; i < inputCount; i++) {
                System.out.println("enter the number :");
                int inputQ18 = scanner.nextInt();
                if (inputQ18 > largest) {
                    largest = inputQ18;
                }else{
                    smallest = inputQ18;
                }
            }
            System.out.println("The smallest number is "+smallest);
            System.out.println("The largest number is "+largest);
        }catch (InputMismatchException e) {
            System.out.println("Must be a number ! ");
        }


/*
        Q18 /  Determine and print the number of times the character ‘a’ appears in the input
entered by the user.

 */
        // ===== answer Q18 ==============
        System.out.println("=========== Q18 ===============");
        scanner.nextLine();
        System.out.println("Enter String: ");
        String inputString = scanner.nextLine();
        int numberOfA = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char in = inputString.charAt(i);

            if (in == 'a'){
                numberOfA++;
            }
        }
        System.out.println("Number of a's: "+ numberOfA);
    }

// ===================== Method Q1 =======================
    public static void userPrompt() {
        int firstNumber;
        int secondNumber;

        try {

            System.out.println("=========== Q1 ===============");
            System.out.println("Please enter first number: ");
            firstNumber = scanner.nextInt();


            System.out.println("Please enter second number: ");
            secondNumber = scanner.nextInt();

            printEquationsResults(firstNumber, secondNumber);

        } catch (InputMismatchException e) {
            System.out.println("Must enter a number");
            scanner.nextLine();
            userPrompt();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void printEquationsResults (int number1, int number2) throws ArithmeticException {
        System.out.println(number1+" + "+number2+" = "+(number1 + number2));
        System.out.println(number1+" - "+number2+" = "+(number1 - number2));
        System.out.println(number1+" * "+number2+" = "+(number1 * number2));
        if (number2 ==0)
            throw new ArithmeticException ("Can not divide by ZERO..!");
        System.out.println(number1+" / "+number2+" = "+(number1 / number2));
        System.out.println(number1+" % "+number2+" = "+(number1 % number2));
    }

    public static double calculateAvg (int numbersCount) throws InputMismatchException {
        double avg = 0;
        int number=0;
try {


    for (int i = 0; i < numbersCount; i++) {

        System.out.println("Enter an integer: ");
        number = scanner.nextInt();
        avg += number;

    }

        avg /= numbersCount;

}catch (InputMismatchException e){
    System.out.println("Must enter a number");
}
        return avg;
    }
}
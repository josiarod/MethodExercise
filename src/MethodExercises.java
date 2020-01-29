import java.util.ArrayList;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> letters = new ArrayList<Character>();
      //prompt the user for 2 numbers
       /*
        System.out.println("Pleaase enter whole number: ");
        int number1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int number2 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int number3 = sc.nextInt();
        */


        //add the two numbers
      //  System.out.println("The sum = " + add(number1,number2));
       // System.out.println("The result is: "+ divide(number1, number2));
      /*
        //Get the length of a string.
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        System.out.printf("The length of " +word+ " is: %d ",  length1(word));
     */


        /*

        System.out.println("Please enter 5 letters: ");
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        Collections.sort(letters);
        System.out.println(letters);
         */

        //Get the average of 3 numbers.
       // System.out.printf("The average is: %d", average(number1,number2,number3));

        /*
        System.out.println("Please enter a year: ");
        int inputYear = sc.nextInt();
        System.out.println("Is this year leap? " + leap(inputYear));
       */

      //  System.out.println(sentence("The dog jumped over the fence"));

        /*
        //Calculate the area of a rectangle with length and width input from the user.
        System.out.println("Pleease enter the length: ");
        double length = sc.nextDouble();
        System.out.println("Please enter the width: ");
        double width = sc.nextDouble();
        System.out.println("The area is: " + area(length,width));
       */
        /*
        System.out.println("Please enter a bound number: " );
        int userNumber = sc.nextInt();
        System.out.println(userNumber + " " + oddOrEven(userNumber));
        */
    }

    public static int add(int num1,int num2){
        return  num1 + num2;
    }

    public static int divide(int num1,int num2){
        if(num2 == 0) {
            try {
                num1 = 30 / num2;
                System.out.println(num2);
            } catch (Exception e) {
                System.out.println("udefined");
            }

        }
        return  num1 / num2;
    }

    public static int length1(String input){
        return input.length();
    }

    public static int average(int num1,int num2,int num3){
        return (num1 + num2 + num3)/3;
    }


    public static boolean leap(int year){
        return year % 4 == 0;
    }

    public static int sentence(String input){
        String[] input1 = input.split(" ");
        return input1.length;
    }

    public static double area(double l, double w){
        return l * w;
    }

   public static String oddOrEven(int number){
        if(number % 2 == 0){
            return "is even";
        }
       return "is odd";
   }


}

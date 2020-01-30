import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //prompt the user for 2 numbers
        //System.out.println(add());

        //divide the two numbers
        //System.out.println("The result is: "+ divide());

        //Get the length of a string.
        //System.out.printf("The length is: %d ",  length1());

        // sort characters
       // System.out.println(sortLetters());

        //Get the average of 3 numbers.
        //System.out.printf("The average is: %d", average());

        // Leap year
        //System.out.println("Is this year leap? " + leap());

        //System.out.println(sentence("The dog jumped over the fence"));

        //Calculate the area of a rectangle with length and width input from the user.
        //System.out.println("The area is: " + area());



        System.out.println("The number is " + oddOrEven());

    }

    public static int add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase enter a whole number: ");
        int number1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int number2 = sc.nextInt();
        return  number1 + number2;
    }

    public static int divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase enter a whole number: ");
        int number1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int number2 = sc.nextInt();
        if(number2 == 0) {
            try {
                number1 = 30 / number2;
                System.out.println(number2);
            } catch (Exception e) {
                System.out.println("udefined");
            }

        }
        return  number1 / number2;
    }

    public static int length1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        return  word.length();
    }

    public static ArrayList<Character> sortLetters(){
        ArrayList<Character> letters = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 letters: ");
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        letters.add(sc.next().charAt(0));
        Collections.sort(letters);
          return letters;
    }

    public static int average(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase enter a whole number: ");
        int number1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int number2 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int number3 = sc.nextInt();
        return (number1 + number2 + number3)/3;
    }


    public static boolean leap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int inputYear = sc.nextInt();
        return inputYear % 4 == 0;
    }

    public static int sentence(String input){
        String[] input1 = input.split(" ");
        return input1.length;
    }

    public static double area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleease enter the length: ");
        double length = sc.nextDouble();
        System.out.println("Please enter the width: ");
        double width = sc.nextDouble();
        return length * width;
    }

   public static String oddOrEven(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a bound number: " );
       int number = sc.nextInt();
        if(number % 2 == 0){
            return "is even";
        }
       return "is odd";
   }
}

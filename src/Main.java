import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ExerciseOne();
        ExerciseTwo();
        ExerciseThree();
        ExerciseFour();
        ExerciseFive();
        ExerciseSix();
        ExerciseSeven();
        ExerciseEight();
    }

    public static void ExerciseOne() {

        for (int i = 0; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if(i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if(i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }

    public static void ExerciseTwo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Text : ");
        String text = input.nextLine();

        String reverseText = "";
        for (int i = 0; i < text.length(); i++) {

            reverseText += text.charAt((text.length()-1) - (i));
        }
        System.out.println(reverseText);
    }
    public static void ExerciseThree() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to factorial value : ");
        int number = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial Result : "+factorial);
    }
    public static void ExerciseFour() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        System.out.println("Enter power number : ");
        int power = input.nextInt();
        int Result = 1;

        for (int i = 0; i < power; i++) {
            Result *= number;
        }
        System.out.println("Result : "+Result);

    }
    public static void ExerciseFive() {

        Scanner input = new Scanner(System.in);
        int number = 0;
        int sumEven = 0;
        int sumOdd = 0;

        do{
            System.out.print("Enter number to sum odd and even number or enter to 0 to exit : ");
             number = input.nextInt();
             if(number%2 == 0){
                 sumEven += number;
             }else sumOdd += number;

        }while(number != 0);

        System.out.println("Total Even : "+sumEven +"\nTotal Odd : "+sumOdd);

    }
    public static void ExerciseSix() {
        Scanner input = new Scanner(System.in);

        boolean isPrime = true;

        int number = 0;

        while(number <= 0){
             System.out.println("please enter number is greater than 0 to check the number is prime number or not: ");
             number = input.nextInt();

             if(number <=0){
                 continue;
             }

             if(number == 1){
                 isPrime = false;
                 break;
             }else if(number == 2){
                 break;
             }else if(number % 2 == 0){
                 isPrime = false;
                 break;
             }
             else{
                 for (int i = 2 ; i < Math.sqrt(number) ; i++){

                     if(number % i == 0){
                         isPrime = false;
                     }
                 }
             }
        }
        System.out.println("The number is "+(isPrime ?"Prime":"Not Prime"));


    }
    public static void ExerciseSeven() {

        for (int i = 0; i < 4; i++) {
            System.out.println("Week "+(i+1));
            for (int j = 0; j < 7; j++) {

                System.out.println("Day "+(j+1));

            }
        }

    }
    public static void ExerciseEight() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text to check is palindrome or not");
        String text = input.nextLine();
        String reverseText = "";
        for (int i = 0; i < text.length(); i++) {

            reverseText += text.charAt((text.length()-1) - (i));
        }
        if(reverseText.equals(text)){
            System.out.println("Text is palindrome : "+text);
        }else{
            System.out.println("Text is not palindrome : "+text);
        }

    }
}
import java.util.Scanner;

public class ReverseNum {
    // public static void main(String[] args) {

    // using while loop.........
    /*
     * int number = 987654, reverse = 0;
     * 
     * while (number != 0) {
     * int remainder = number % 10;
     * reverse = reverse * 10 + remainder;
     * number = number / 10;
     * }
     * System.out.println("The revesre of the given number is :" + reverse);
     */

    // using for loop.......

    /*
     * int number = 123456, reverse = 0;
     * for (; number != 0; number = number / 10) {
     * int remainder = number % 10;
     * reverse = reverse * 10 + remainder;
     * }
     * System.out.println("The reverse of the given number is :" + reverse);
     * 
     */

    // Reverse a number using Recursion.......
    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number that you want to reverse :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.print("the reverse of the  given number is :");
        reverseNumber(num);
    }

    // }

}

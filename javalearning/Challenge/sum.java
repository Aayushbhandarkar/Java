package Challenge;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {  // ✅ main method is required to run the code

        Scanner input = new Scanner(System.in);  // ✅ create Scanner object

        System.out.print("Please enter the first number: ");
        int firstNum = input.nextInt();  // ✅ input 1

        System.out.print("Please enter the second number: ");
        int secondNum = input.nextInt();  // ✅ input 2

        int sum = firstNum + secondNum;  // ✅ calculate sum

        System.out.println("The sum of the two numbers = " + sum);  // ✅ print result

        input.close();  // ✅ close Scanner
    }
}

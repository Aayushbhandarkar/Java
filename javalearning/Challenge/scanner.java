package Challenge;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();  // 🔥 clear the leftover newline

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        if(age != 18){
            System.out.println("Welcome to our company");
        } else {
            System.out.println("Chala jaa bsdk");
        }

        // Just to confirm input
        // System.out.println("Name: " + name);
        // System.out.println("City: " + city);
    }
}

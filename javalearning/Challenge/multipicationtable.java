package Challenge;

import java.util.Scanner;

public class multipicationtable {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number for Multiplication Tbale");
          int num = sc.nextInt();
          printTable(num);
    }
    public static void printTable(int n){
        for(int i = 1; i<=10 ;i++){
            System.out.println(n + "*" + i + " =" + n*i);

        }
    }
   
}

package Challenge;

import java.util.Scanner;

public class sumOfOddNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int sum = sumOfOddNumbers(n);
        System.out.println("sum of odd Number from 1  to" + n + "is"+ sum);

        
    }

    public static int sumOfOddNumbers(int n){
        int sum =0;
        for(int i =1; i<= n ; i++){
            if(i%2 !=0){
                sum += i;


            }
        }
        return sum;
    }
    
}


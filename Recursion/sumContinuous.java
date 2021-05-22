package Recursion;
// sum of n natural numbers using recursion

import java.util.Scanner;

public class sumContinuous {
    static int sum(int n){
        if(n==0){return 0;}
        else{
            return sum(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println("Sum of first "+n+" natural numbers is "+ans);
    }
}

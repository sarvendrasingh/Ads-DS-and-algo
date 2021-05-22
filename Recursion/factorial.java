package Recursion;

import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n==0){return 1;}
        else{
            return fact(n-1)*n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int ans;
        ans = fact(n);
        System.out.println("Factorial of "+n+" is "+ans);
    }
}

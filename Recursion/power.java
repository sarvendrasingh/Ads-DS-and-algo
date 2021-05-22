package Recursion;

import java.util.Scanner;

// n to the power of m (using recursion)
public class power {
    static int power(int m, int n){
        if(n==0){return 1;}
        //  return m*power(m,n-1);
        if(n%2 ==0){
            return power(m*m,n/2);
        }
        else{
            return m*power(m*m,(n-1)/2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter value of base(m): ");
        m = sc.nextInt();
        System.out.print("Enter value of power(n): ");
        n = sc.nextInt();
        int ans;
        ans = power(m,n);
        System.out.println(n+" to the power of "+m+" is "+ans);
    }
}

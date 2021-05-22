package Recursion;

import java.util.Scanner;

public class combinationSelection{

    static int nCr(int n, int r){
        if(n==r || r==0){
            return 1;
        }
        return nCr(n-1,r-1)+nCr(n-1,r);
    }

    public static void main(String[] args) {
        int n,r;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        int ans;
        ans = nCr(n,r);
        System.out.println(n+"C"+r+" = "+ans);
    }

}

// int nCr(int n, int r){
//     int num,den;
//     num = fact(n);
//     den = fact(n-r)* fact(r);
//     return num/den;
// }


//        int nCr(int n, int r){
//        if(n==r || r==0){
//        return 1;
//        }
//        return nCr(n-1,r-1)+nCr(n-1,r);
//        }


//        int main()
//        {
//        int n,r;
//        scanf("%d %d", &n,&r);
//        int ans;
//        ans = nCr(n,r);
//        printf("%dC%d is %d",n,r,ans);
//        return 0;
//        }

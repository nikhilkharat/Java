package Assg;

import java.util.Scanner;

public class _09Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Number you want to Factorial");
        int tc= sc.nextInt();
        int []arr= new int[tc];
        if(arr.length>=3){
            System.out.println("Error");
        }
        else if(arr.length==2){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int diff=Math.abs(n1-n2);
            int prod=1;
            for (int i=1;i<=diff;i++){
                prod*=i;
            }
            System.out.println(prod);
        } else if (arr.length==1) {
            int n4=sc.nextInt();
            int prod=1;
            for (int i = 1; i <= n4; i++) {
                prod *= i;
            }
            System.out.println(prod);
        }

    }
}

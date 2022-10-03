package Assg;

import java.util.*;

public class _03String {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        System.out.println("Enter the character position you want to access");
        int n= sc.nextInt();
        System.out.println("Character at position "+n+" is "+s.charAt(n));

    }
}

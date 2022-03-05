package com.avarage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 :");
        a = sc.nextInt();
        System.out.print("Enter num 2 :");
        b = sc.nextInt();
        System.out.print("Enter num 3 :");
        c = sc.nextInt();

        float sum = a + b+ c;
        float avarage = sum/3;
        System.out.println("Avarage : "+avarage);

    }
}

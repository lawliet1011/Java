package com.company;

import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        int n;
        int a;
        int b;
        int max;
        int min;
        System.out.println("Nhap so nguyen duong:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = n/10;
        b = n%10;
        max = b;
        n = a;
        while(n>0){
            a = n/10;
            b = n%10;
            min = b;
            if(min>max) {
                max = min;
            }
            n = a;
        }
        System.out.println("Chu so lon nhat la:" + max);
    }
}

package com.company;

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen duong :");
        int n;
        int a;
        int b;
        int chan;
        int tong=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0) {
            a = n / 10;
            b = n % 10;
            if (b % 2 == 0) {
                chan = b;
                tong= chan +tong;
            }
            n=a;
        }
        System.out.println("Tong = " + tong);
    }
}
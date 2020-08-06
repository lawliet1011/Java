package com.company;

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        int n;
        int a;
        int b;
        int dem=0;
        int le;
        System.out.println("Nhap so nguyen duong:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n>0){
            a = n/10;
            b = n%10;
            if(b%2!=0){
                le = 1;
                dem = dem + le;
            }
            n = a;
        }
        System.out.println("Tong so le la:" + dem);
    }
}

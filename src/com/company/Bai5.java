package com.company;

import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        int n;
        int a;
        int b;
        int chan=0;
        int le=0;

        System.out.println("Nhap so nguyen duong:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            a = n/10;
            b = n%10;
            if(b%2==0){
                chan = chan + 1;
            }else{
                le = le + 1;
            }
            n = a;
        }
        if(chan==0){
            System.out.println("So la so toan le");
        }
        if(le==0){
            System.out.println("So la so toan chan");
        }
        if(chan!=0 && le!=0){
            System.out.println("So co ca le va chan");
        }

    }
}

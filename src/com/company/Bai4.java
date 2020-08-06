package com.company;


import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        int m;
        int n;
        int a;
        int b;
        int min;
        int max;
        int dem=0;
        System.out.println("Nhap so nguyen duong:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = n;
        a = n/10;
        b = n%10;
        min = b;
        n = a;
        while(n>0){
            a = n/10;
            b = n%10;
            max = b;
            if(min >max){
                min = max;
            }
            n = a;
        }

        while(m>0){
            a = m/10;
            b = m%10;
            if(b==min){
                dem = dem + 1;
            }
            m = a;
        }

        System.out.println("So luong chu so nho nhat la:" + dem);
    }
}

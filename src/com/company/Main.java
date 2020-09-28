package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max=-100000;
        int n =scan.nextInt();
        int[]p= new int[n];
         for(int i=0;i<n;i++) {
             p[i] = scan.nextInt();
             if(p[i]>max) max=p[i];
         }
        System.out.println(max);
         }
    }


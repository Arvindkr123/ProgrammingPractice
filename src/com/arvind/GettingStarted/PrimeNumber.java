package com.arvind.GettingStarted;import java.util.Scanner;/*For example:Sample Input:5132345Sample Output:primeprimeprimenot primeprime* */public class PrimeNumber {    public static void main(String[] args) {        Scanner scn = new Scanner(System.in);        int t = scn.nextInt();        for (int i = 0; i < t; i++) {            int n = scn.nextInt();            int count =0;            for (int div = 2; div*div <=n; div++) {                if(n%div==0){                    count++;                }            }            if(count==0){                System.out.println("prime Number");            }else{                System.out.println("Not prime");            }        }    }}
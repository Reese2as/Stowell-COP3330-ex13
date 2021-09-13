/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double principal, ROI, final_amount;
        int years,num_compounded;

        System.out.print("What is the principal amount? ");
        principal = user_input.nextDouble();
        System.out.print("What is the rate? ");
        ROI = (user_input.nextDouble()/100);
        System.out.print("What is the number of years? ");
        years = user_input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        num_compounded = user_input.nextInt();

        final_amount= principal * Math.pow((1+ ROI/num_compounded), num_compounded *years);

        ROI *= 100;

        System.out.println(String.format("%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f",principal,ROI,years,num_compounded,final_amount));
    }
}

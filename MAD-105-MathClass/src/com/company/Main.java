package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        double total = 0;
        double purchase, taxes, tipPercentage, tip;
        DecimalFormat format = new DecimalFormat("#0.00");

        do{
            System.out.print("Please enter the dollar amount for your Purchase: ");
            purchase = scan.nextDouble();

            total += purchase;

        }while(purchase != 0);

        taxes = total * 0.025;
        taxes = Double.parseDouble(format.format(taxes));

        System.out.println("Your Total is $" + total);
        System.out.println("The Taxes are $" + taxes);

        System.out.print("What percentage do you want you tip to be(recommended 17.5%)? ");
        tipPercentage = scan.nextDouble();

        tip = total * (tipPercentage/100);
        tip = Double.parseDouble(format.format(tip));

        System.out.println("Your Tip is $" + tip);
        System.out.println("Your Total is $" + (total + taxes + tip));
    }
}

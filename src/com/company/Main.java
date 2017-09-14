package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("Which shape would you like to compute the area of(enter a number)?\n1. Square\n2. Triangle\n3. Circle\n4. Trapezoid");
        choice = scan.nextInt();



        switch (choice){
            case 1:
                square();
                break;
            case 2:
                triangle();
                break;
            case 3:
                circle();
                break;
            case 4:
                trapezoid();
                break;
            default:
                System.out.print("Read the prompt and follow it, idiot");

        }
    }

    public static void square(){
        Scanner scan = new Scanner(System.in);
        double height, base;
        System.out.print("Enter the height");
        height = scan.nextDouble();
        System.out.print("Enter the base");
        base = scan.nextDouble();

        System.out.print(height*base);
    }

    public static void triangle(){
        Scanner scan = new Scanner(System.in);
        double height, base;
        System.out.print("Enter the height");
        height = scan.nextDouble();
        System.out.print("Enter the base");
        base = scan.nextDouble();

        System.out.print((height*base)/2);
    }

    public static void circle(){
        Scanner scan = new Scanner(System.in);
        double radius;

        System.out.print("Enter the radius");
        radius = scan.nextDouble();

        System.out.print(3.14*radius*radius);
    }

    public static void trapezoid(){
        Scanner scan = new Scanner(System.in);
        double height, base, base2;
        System.out.print("Enter the height");
        height = scan.nextDouble();
        System.out.print("Enter base 1");
        base = scan.nextDouble();
        System.out.print("Enter base 2");
        base2 = scan.nextDouble();

        System.out.print(.5*(base+base2)*height);
    }
}

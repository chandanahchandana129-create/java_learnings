import java.lang.System;
import java.util.Scanner;

class user_input_double{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double f  = scn.nextFloat();
        System.out.println("The  value of f is: "+double);
        
    }
}

class addition_of_two_numbers{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scn.nextInt();
        System.out.println("Enter second number");
        int b = scn.nextInt();
        int sum = a + b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);


    }
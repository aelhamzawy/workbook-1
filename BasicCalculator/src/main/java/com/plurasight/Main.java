package com.plurasight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // creating main variables
        double firstNumber;
        double secondNumber;
        String operator;
        double result;

        System.out.println("Welcome to the basic java calculator app: ");
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        firstNumber = Input.nextDouble();
        System.out.println("----------------------------------");
        System.out.print("Enter the Second Number: ");
        secondNumber = Input.nextDouble();
        System.out.println("----------------------------------");
        System.out.print("Enter the operator + - * / : ");
        operator = Input.next();

        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("The result is "+ result);
                break;
            case  "-":
                result = firstNumber - secondNumber;
                System.out.println("The result is "+ result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("The result is "+ result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("The result is "+ result);
                break;
            default:
                System.out.println("Invalid Input");
        };







    }
}
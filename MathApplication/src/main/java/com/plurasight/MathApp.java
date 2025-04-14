package com.plurasight;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class MathApp {
    public static void main(String[] args){
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //  Question 1
        double bobSalary = 5000.50;
        double qarySalary = 6200.75;
        double highestSalary;
        highestSalary = Math.max(bobSalary,qarySalary);
        System.out.println("The Heights Salary is " +highestSalary);
        /// ////////////////////////////////////////////////

        // Question 2
        double carPrice = 17.457;
        double truckPrice = 20.4725;
        double heightstPrice = Math.min(carPrice,truckPrice);
        System.out.println("The Heighst Vehicle Price is "+heightstPrice);
        /// ///////////////////////////////////////////////////

        // Question 3
        double radius = 7.25;
        double doubleRadius = Math.pow(radius,2);
        double bi = 3.14159;
        double area = bi * doubleRadius;
        System.out.println("THe Area of the Circle is "+area);
        /// ///////////////////////////////////

        // Question 4
        double myNumber = 5.0;
        double squareRoot = Math.sqrt(myNumber);
        System.out.println("The Square Root Of the Number is "+squareRoot);

        /// ///////////////////////////////
        // Question 5
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        int distenceBeteenXs = x2 - x1;
        int distenceBeteenYs = y2 - y1;
        System.out.println("The Distance Between the x is "+distenceBeteenXs);
        System.out.println("The istance between Y is "+distenceBeteenYs);

        /// ///////////////////////////////////////////////

        // Question 6
        double num = -3.8;
        double absoluteNum = Math.abs(num);
        System.out.println("The Absolute Value for the Number is "+absoluteNum);
        /// ///////////////////////////////////
        // Question 7
        double RandomNumber = Math.random();
        System.out.println("The Random Number is "+RandomNumber);



    }
}

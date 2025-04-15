package com.plurasight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("This is a payRoll Calculator");
        // Creating the variables
         String EmployeeName;
         double TotalHours;
         double PayPerHour;
         double payRoll;



        // creating the scanner input
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Enter your Name then press Enter: ");
        EmployeeName = scannerInput.nextLine();
        System.out.print("Enter the Total Hours you have been Working then press Enter: ");
        TotalHours = scannerInput.nextDouble();
        System.out.print("Enter your payment Per Hour then press Enter: ");
        PayPerHour =  scannerInput.nextDouble();

        payRoll = TotalHours * PayPerHour;

        System.out.printf("Employee Name is %s Total Hours is %.3f Payment per hour is %.3f : \n", EmployeeName, TotalHours, PayPerHour);

        System.out.printf("Total Payroll Gross is %.3f $", payRoll);

    }
}





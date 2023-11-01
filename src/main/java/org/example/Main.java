package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static int subtract(int num1,int num2){
        return num1-num2;
    }

    public static int multiply(int num1,int num2){
        return num1*num2;
    }

    public static int division(int num1,int num2){
        if(num2==0)
            logger.warn("Division with 0 is not allowed");
        return num1/num2;
    }
    public static void main(String[] args) {
        // Main calc = new Main();
        System.out.println("Please select the operation from below: ");
        logger.info("Program Started");
        System.out.println("1. Add ");
        System.out.println("2. Subtract ");
        System.out.println("3. Multiply ");
        System.out.println("4. Division ");
        System.out.println("5. Exit ");
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter Choice: ");
        int choice = myObj.nextInt();  // Read user input

        System.out.println("Enter the 2 numbers: ");
        int num1 = myObj.nextInt();  // Read user input
        int num2 = myObj.nextInt();  // Read user input   
        int ans=0;
        switch(choice) {
            case 1:
                ans=add(num1,num2);
                break;
            case 2:
                ans=subtract(num1,num2);
                break;
            case 3:
                ans=multiply(num1,num2);
                break;
            case 4:
                ans=division(num1,num2);
                break;
            case 5:
                myObj.close();
                return;
          }
        System.out.println("The answer is = "+ans);
        myObj.close();
    }
}
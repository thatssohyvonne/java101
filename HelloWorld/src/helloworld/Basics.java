/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;//library is used for USER INPUT 

/**
 *
 * @author thatssohyvonne
 */
public class Basics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //USER INPUT
        //STRING
        //to allow user to have an input follow the following format:
        //Scanner InputName = new Scanner(System.in);
        //String NameOfVariable = InputName.nextLine();
        Scanner EnterName = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String NameOfUser = EnterName.nextLine();
        System.out.println("Welcome " + NameOfUser);
        System.out.println("\n");
        
        //INTEGER
        //to allow user to have an input follow the following format:
        //Scanner InputName = new Scanner(System.in);
        //int NameOfVariable = InputName.nextInt();
        Scanner EnterAge = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int Age = EnterAge.nextInt();
        System.out.println("You are: " + Age + " years old");
        System.out.println("\n");
        
        //DOUBLE
        //to allow user to have an input follow the following format:
        //Scanner InputName = new Scanner(System.in);
        //double NameOfVariable = InputName.nextDouble();
        Scanner EnterAmount = new Scanner(System.in);
        System.out.println("Please enter the amount of money you have: ");
        double TotalAmount = EnterAmount.nextDouble();
        System.out.println("You have $" + TotalAmount);
        System.out.println("\n");
        
        System.out.println("Lets start!");
        System.out.println("\n");
                
        //--------------------------------------------------------------//
        
        //INITIALISING 
        //STATIC
        //to initialise a variable follow the following format:
        //type NameOfVariable = expression;
        //note: S in String must be capitalised otherwise it is not recognised as a type
        int a = 0;
        String Name = "Hello";
        double radius = 15.4;
                
        //--------------------------------------------------------------//
        
        //PRINTING
        //to print the variables value follow the following format:
        //System.out.println(NameOfVariable);
        System.out.println("SAMPLE ANSWER AS TO HOW TO PRINT A VARIABLE");
        System.out.println(a);
        System.out.println(Name);
        System.out.print(radius);
        
        //to print with a blank line to separate the different prints
        //System.out.println("\n");
        //"\n" in generally coding refers to new line
        System.out.println("\n");
        
        //to print variable in a sentence follow the following format:
        //System.out.println("sentence that you would like to form" + NameOfVariable);
        
        System.out.println("SAMPLE ANSWER AS TO HOW TO PRINT A VARIABLE IN A SENTENCE");
        System.out.println("Integer a = " + a);
        System.out.println("String Name = " + Name);
        System.out.println("Double radius = " + radius);
        System.out.println("\n");
        
        //DIFFERENCE BETWEEN .println and .print
        //.println prints every variable on a new line
        //.print prints it continuously --> means if you want to print array this is usually the correct option
        
        //--------------------------------------------------------------//
    }
    
}

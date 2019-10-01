/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

//IMPORT
//this portion is used to import libraries that are needed for some functions/commands in java to work
import java.util.Scanner; //library is used for USER INPUT 

/**
 *
 * @author thatssohyvonne
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Welcome to Java! This code's main purpose is to be a quick guide to how to code certain things in Java
        //The following codes are all coded in the software called: NetBeans IDE 8.0.2
       
        //--------------------------------------------------------------//
        
        //Things to note:
        //This file is created for beginners with a little background knowledge to coding, or are jumping from one programming language to Java
        //This in no way is to serve as a crash course, however most of the basic and necessary functions are available in this tutorial
        //Do note that you are strongly advised to head down to platforms such as youtube, github, stackoverflow if you are unsure of how do codes run
        //The purpose of this file is purely cause googling sometimes can be quite painful and annoying when you have many answers but you have no idea which one to follow
        //These are set ups and code in a Windows 10 environment. 
        //If you are a Windows 8 and below OR
        //If you are a Linux user, it may differ for you! Please do not assume that it will work the same! Try and test every line if needed!
        
        //--------------------------------------------------------------//
        
        //Hello World
        //Coders usually print Hello World as a "right of passage" 
        //Usually if you are able to print Hello World, you should not have an issue when it comes to printing out statements or results
        System.out.println("Hello World");
        System.out.println("\n");
        
        //--------------------------------------------------------------//
        
        //ENVIRONMENT PREPARATION
        //If you would like to run your code on command prompt (cmd)
        //Ensure you have the following:
        //Java SE Development Kit (JDK)
        //download link: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
        
        //Java SE RunTime Environment (JRE)
        //download link: https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
        
        //note that you should download according to what your device is. If your device is a linux, download the linux one. If your device is a windows, you download the windows one. 
        
        //Ensure that you have the following directories:
        //c:\Program Files\java\jdk
        //c:\Program Files\java\jre
        //These directories are universal for all Windows Operating System
        
        //To load the environment, follow the directions in: https://docs.oracle.com/javase/9/install/installation-jdk-and-jre-microsoft-windows-platforms.htm#JSJIG-GUID-96EB3876-8C7A-4A25-9F3A-A2983FEC016A
        //If you dont understand, please go onto youtube. There are plenty of tutorials available for various operating systems. For first timers, it may be easier to follow using a youtube tutorial.
        
        //If you would like to understand further on what in the world you are doing, I recommend you read the following blog post: http://gedankenverlust.blogspot.com/2012/05/java-environment-variables-definitive.html
        //ps: I am not the author of that post so it aint a shameless plug
        
        //--------------------------------------------------------------//
        
        //EXECUTION
        //THIS IS ONLY IF YOU HAVE SET UP YOUR ENVIRONMENT 
        //to execute the .java file on cmd
        //check if java is running on the machine
        //type: java -version
        //cd to the file directory that .java file is in
        //next run the .java file
        //type: javac FileName.java
        //run the class file
        //type: java ClassFileName
        
        //ERROR: Could not find or load main class [SOLUTION]
        //cd out by one file
        //example: 
        //if HelloWorld.class is located in C:\User\Desktop
        //type: cd C:\User
        //type: java Desktop.HelloWorld
        
        //NOTE: when you run the command "javac", you will notice a .class file is created.
        //the .class file will contain hexidecimal numbers and nothing else
        //1. you dont have to worry about it if you are a beginner. If you would like to understand more, you may read: https://en.wikipedia.org/wiki/Java_class_file
        //2. you CAN delete the file if you wish. No harm will be done.
        
        //--------------------------------------------------------------//
        
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
        
        //ARRAY
        //STATIC
        //STATIC ARRAY (1D)
        //to create a 1D static array follow the following format:
        //type NameOfArray[] = new type[]{ variable, variable, variable };
        int Hello1DStaticArray[] = new int[]{ 1,2,3,4,5 };
        
        //STATIC ARRAY (2D)
        //to create a 2D static array follow the following format:
        //type NameOfArray[][] = new type[] { {variable, variable, variable},{variable, variable, variable} };
        int Hello2DStaticArray[][] = new int[][] { {1,2,3,4,5},{1,2,3,4,5} };
        
        //it will look like the following in the array
        //1 2 3 4 5
        //1 2 3 4 5
        
        //DYNAMIC
        //DYNAMIC ARRAY (1D)
        //to create a 1D dynamic array follow the following format: 
        //type NameOfArray[] = new type [size];
        int Hello1DDynamicArray[] = new int [20];
        
        //DYNAMIC MULTIDIMENSIONAL ARRAY (2D)
        //to create a 2D dynamic array follow the following format:
        //type NameOfArray[][] = new type [size][size];
        int Hello2DDynamicArray[][] = new int [20][20];
        
        //2D ARRAY CREATION ALTERNATIVE
        //this example works for both implementing it dynamically and statically
        //to implement it in a dynamic form, follow the first 3 lines
        //this would help if you are allowing the user to determine the number of rows and columns for the array to create the array
        int rows = 5;
        int columns = 5;
        int[][] HelloAlternative = new int[rows][columns];
        
        
        System.out.println("SAMPLE ANSWER AS TO HOW TO PRINT AN ARRAY");
        //PRINTING VARIABLES IN ARRAY 
        //PRINT 1D
        //to print 1D array follow the following format:
        //for (int i = 0; i < NameOfArray.length;i++)
        //  System.out.println(NameOfArray[i]);
        //this works for both dynamic and static
        System.out.println("1D ARRAY: ");
        for(int i = 0; i < Hello1DStaticArray.length; i++){
            System.out.println("Value in position " + i + " is: " + Hello1DStaticArray[i]);
        }
        System.out.println("\n");
        
        //PRINT 2D
        //to print 2D array follow the following format:
        //for(int i = 0; i < NumberOfRowsInArray; i++)
        //  for(int j = 0; j < NumberOfColumnsInArray; j++)
        //      System.out.println(NameOfArray[i][j])
        System.out.println("2D ARRAY: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(Hello2DStaticArray[i][j] + " ");
            }
            System.out.println();
        }
        
        //--------------------------------------------------------------//
        
    }
    
}

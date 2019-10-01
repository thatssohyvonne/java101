/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author thatssohyvonne
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
                //--------------------------------------------------------------//
        
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
        for(int i = 0; i < Hello2DStaticArray.length; i++){
            for(int j = 0; j < Hello2DStaticArray[0].length; j++){
                System.out.print(Hello2DStaticArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
                //--------------------------------------------------------------//
        
        //SUM
        //SUM ACROSS ROWs
        //Declare a variable to contain the total sum of the numbers
        int sumRow = 0;
        
        //use a for loop to add the rows
        for(int i = 0; i < Hello1DStaticArray.length; i++){
            sumRow = sumRow + Hello1DStaticArray[i];
        }
        System.out.println("Sum for the Row: " + sumRow);
        
        //SUM ACROSS COLUMNS
        //Declare a variable to contain the total sum of the numbers
        int sumCol = 0;
        
        //use a for nested for loop to add the columns
        for(int i = 0; i < Hello2DStaticArray.length; i++){
            for(int j = 0; j < Hello2DStaticArray[0].length; j++){
                sumCol = sumCol + Hello2DStaticArray[i][j];
            }
        }
        System.out.println("Sum for the Column: " + sumCol);
        
        //SUM FOR EACH COLUMN
        //We will use another array to store the total sum for each column
        //Therefore, you want to start with declaring a new array
        int StorageOfSum[] = new int[5];
        for(int i = 0; i < Hello2DStaticArray.length; i++){
            for(int j = 0; j < Hello2DStaticArray[0].length; j++){
                StorageOfSum[j] += Hello2DStaticArray[i][j];
            }
        }
        
        //now we will print the array that stores that sum for each column
        for (int i = 0; i < StorageOfSum.length; i++){
            System.out.println("Column " + i + " total is: " + StorageOfSum[i]);
        }
        
        //--------------------------------------------------------------//
    
    }
}



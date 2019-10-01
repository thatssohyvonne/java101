/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

//Please read ExecutorClass.java 
//Executor.java and ExecutorClass.java comes together

/**
 *
 * @author thatssohyvonne
 */

import helloworld.ExecutorClass;

public class Executor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EXECUTE THE .JAVA CLASS FILE
        //in order to execute the .java class file follow the following format:
        //packagename.ClassName NameOfVariable = new packagename.ClassName();
        //NameOfVariable.ClassPublicVoidName();
        helloworld.ExecutorClass person = new helloworld.ExecutorClass();
        person.release();
    }
    
}

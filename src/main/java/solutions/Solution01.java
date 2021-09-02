/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solutions;

import java.util.Scanner; //This imports the Scanner class

public class Solution01 {

    /*
    Create a program that prompts for your name
        Asks user for name
        Takes in name using Scanner object
    prints a greeting using name that was input

     */
    public static void main(String[] args){

        String fName,greeting; //creates a String object
        Scanner name = new Scanner(System.in); //Creates a scanner object for user input

        System.out.print("What is your name? "); //This asks for user's name
        fName = name.nextLine(); //Reads user's name
        greeting = "Hello " + fName + ", very nice to meet you!";
        System.out.println(greeting);




    }

}

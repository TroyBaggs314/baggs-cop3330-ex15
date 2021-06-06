/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;

class Pass
{
    String userGuess;
    String passGuess;
}
public class Exercise15
{
    public static void main( String[] args )
    {
        Pass p = new Pass();
        p = inputs(p);
        if(p.userGuess.equals("Admin") && p.passGuess.equals("abc$123"))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }

    public static Pass inputs(Pass p)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "What is the username?" );
        p.userGuess = sc.nextLine();
        System.out.println( "What is the password?" );
        p.passGuess = sc.nextLine();
        return p;
    }
}

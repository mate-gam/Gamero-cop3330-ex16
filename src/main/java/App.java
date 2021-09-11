/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.io.Console;
public class App
{
    public static void main (String[] args)
    {
        Console con = System.console();
        String age = con.readLine("What is your age? ");
        int realAge = Integer.parseInt(age);
        int driverAge = 16;
        System.out.println(realAge >= driverAge ? "You are old enough to drive" : "You are not old enough to drive");
    }
}

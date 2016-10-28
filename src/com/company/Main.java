package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputstring = new Scanner(System.in);
        System.out.println("Enter a grade");
        double grade = input.nextDouble();
        System.out.println("Enter the student's name that got that grade.");
        String name = inputstring.nextLine();
        double sum = 0;
        int x = 0;
        int num = 0;
        double grades [] = new double[100];
        String names [] = new String[100];

        while(true)
        {
            grades [x] = grade;
            names [x] = name;
            sum += grade;
            x++;
            num++;
            System.out.println("Enter a grade or -1 to stop.");
            grade = input.nextDouble();
            if(grade == -1.0)
            {
                break;
            }
            System.out.println("Enter the student's name that got that grade.");
            name = inputstring.nextLine();
        }
        System.out.println("The list of student names is:");
        for(int i = 0; i <= num; i++)
        {
            System.out.println("Student " + (i+1) + ": " + names[i]);
        }
        System.out.println("");
        System.out.println("The average grade was: " + sum/num);
    }
}

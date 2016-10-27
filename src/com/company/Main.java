package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade");
        double grade = input.nextDouble();
        double sum = 0;
        int x = 0;
        int num = 0;
        double grades [] = new double[100];
        String names [] = new String[100];
        for(int i = 0; i < grades.length; i++)
        {
            grades [i] = -5;
        }

        while(true)
        {
            grades [x] = grade
            sum += grade;
            x++;
            System.out.println("Enter a grade");
            grade = input.nextDouble();
            if(grade == -1.0)
            {
                break;
            }
        }
        for(int i = 0; i < grades.length; i++)
        {
            if(grades [i] != -5)
            {
                num += 1;
            }
        }
        System.out.println(sum/num);
    }
}

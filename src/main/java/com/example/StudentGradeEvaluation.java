package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s=sc.nextLine();
        System.out.println("Name: " +s);

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Age: " +age);

        System.out.println("Enter your exam score: ");
        int grade = sc.nextInt();
        System.out.println("score: " +grade);
        
        String sr=sc.nextLine();
        System.out.println("Grade: A" +sr);
    }
}


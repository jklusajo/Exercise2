package com.example.exercise2;

public class Task2 {
    public static void main(String[] args){

        float earthWeightLusajo;
        float marsWeightLusajo;
        double marsWeightLusajoInDouble;
        int marsWeightLusajoInInt;

        earthWeightLusajo = 50;
        marsWeightLusajo = earthWeightLusajo*0.38F;
        System.out.println(earthWeightLusajo + " kg on Earth is " + marsWeightLusajo + " kg on Mars.");

        marsWeightLusajoInDouble = marsWeightLusajo;
        System.out.println("Mass on Mars after converting to double is: " + marsWeightLusajoInDouble);

        System.out.printf("Mass on Mars displayed after converting it into four decimal points is: %.4f %n", marsWeightLusajoInDouble);

        marsWeightLusajoInInt = (int)marsWeightLusajoInDouble;
        System.out.println("After being casted to integer: " + marsWeightLusajoInInt);

        char c = (char)marsWeightLusajoInInt;
        System.out.println("ASCII table equivalent to marsWeightLusajoInInt is " + c);

        int MathExampleOnChar = c*c;
        System.out.println("An Example of a Mathematical operation on char is: " +  MathExampleOnChar);
    }
}
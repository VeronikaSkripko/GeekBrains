package ru.geekbrains.homework.lesson1;

public class Main {
    public static void main(String[] args) {
    }
    public static void varInit(){
        byte myByte = 120;
        short myShort = 31000;
        int myInt = 10000;
        long myLong = 12000L;
        float myFloat = 12.5f;
        double myDouble = 5.3;
        char myChar = 'a';
        boolean myBool = true;
    }
    public static float calculate(float a, float b, float c, float d)
    {
        float result;
        return (result = a * (b + (c / d)));
    }
    public static boolean isRightSum(int a, int b)
    {
        if ((a + b) >= 10 && (a + b) <= 20)
            return (true);
        else
            return (false);
    }
    public static void checkNumber(int a){
        if (a >= 0){
            System.out.println(a + " is a positive number");
        }
        else{
            System.out.println (a + " is a negative number");
        }
    }
    public static boolean isNegativeNum(int a){
        if (a < 0){
            return true;
        }
        return false;
    }
    public static void helloName(String name){
        System.out.println("Привет, " + name + "!");
    }
    public static void year(int year){
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
            System.out.println("This ia a regular year");
        }
        else{
            System.out.println("This is a leap year");
        }
    }
}
package ru.geekbrains.homework.lesson2;

import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,0,1,0};
        //chance1to0Arrays(arr);
        int[] a = new int[8];
        //createArray8(a);
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //createArrayMultiplication6(b);
        int[][] table = new int[5][5];
        //createTwoDimenArray(table);
        //findMinMaxElem(b);
        int[] c = {4,3,1,8};
    }
    public static void chance1to0Arrays(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            }
            else if (arr[i] == 0){
                arr[i] = 1;
            }
        }
        //тернарный оператор arr[i] = (arr[i] == 1)? 0 : 1;
    }
    public static void createArray8(int[] arr){
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + 3;
        }
    }
    public static void createArrayMultiplication6(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 6;
            }
        }
        //Тернатный оператор
    }
    public static void createTwoDimenArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    arr[i][j] = 1;
                }
            }
        }
    }
    public static void findMinMaxElem(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }
    }
    public static boolean checkBalance(int[] arr){
        int right = 0;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                right = right + arr[j];
            }
            left += arr[i];
            if (left == right) {
                return (true);
            }
            right = 0;
        }
        return(false);
    }
}

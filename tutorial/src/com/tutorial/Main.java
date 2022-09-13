package com.tutorial;

public class maxmin {

    public static void findmaxmin (int[] number) {
	// write your code here
        int max = number[0];
        int min = number[0];

       // int [] maxmin = [5, 7, 2, 4, 9, 6];
         for(int i = 1; i < number.length; i++){

             if(number[i] > max) {
                max = number[i];
             }
             else if(number[i] < min){
                 min = number[i];

             }
         }
        System.out.println("min element" + min);
        System.out.println("max element" + max);
    }
    public static void main(String[] args){
        int [] number =[5, 7, 2, 4, 9, 6];
        findmaxmin(number);

    }
}

package com.aryosh.test.one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do{
            System.out.print("Input Number 1-100 (0 for exit): ");
            if (!sc.hasNextInt()){
                System.out.println("Invalid Input!");
            } else {
                input = sc.nextInt();
                if( 0 < input && input <= 100 ){
                    triangle(input);
                }else{
                    System.out.println("Invalid Input Range!");
                }
            }
        }while (input != 0 );
        System.out.println("Thank You!");
    }

    public static void triangle(int in){
        for (int x = 1; x <= in;x++){
            for(int y = in; y > x; y--){
                System.out.print(" ");
            }
            for(int z = 0; z<x; z++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

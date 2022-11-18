package com.jminx42.app;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Guess a number between 1 and 10: [You have 3 chance(s) left]");
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random(); //instance of random class
        int upperbound = 9;
        //generate random values from 0-8
        int intRandom = rand.nextInt(upperbound) + 1;

        for(int i = 1; i <= 3; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == intRandom) {
                System.out.println("Congrats!! You Guessed Correctly");
                break;
            } else if (i == 3){
                System.out.println("GAME OVER\n" + "The Correct Number was: " + intRandom);
            } else if (input > intRandom) {
                System.out.println("Too High... Please Try Again.");
            } else {
                System.out.println("Too Low... Please Try Again.");
            }
        }
    }
}
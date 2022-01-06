package com.codegym;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] scores;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Size should not exceed 10");
            }
        } while (size > 10);
        scores = new int[size];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores for student number: "+ (i+1));
            scores[i] = sc.nextInt();
        }
        int countPass = countPass(scores);
        System.out.println("There are " + countPass +" students pass the test");
    }

    public static int countPass(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 5 && array[i]<=10){
                count++;
            }
        }
        return count;
    }
}

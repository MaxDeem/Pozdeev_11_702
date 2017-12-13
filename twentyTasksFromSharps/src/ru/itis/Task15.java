package ru.itis;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ticketNumber = reader.nextInt();

        int oddSum = (ticketNumber / 100000) + (ticketNumber / 1000 % 10) + (ticketNumber / 10 % 10);
        int evenSum = (ticketNumber / 10000 % 10) + (ticketNumber / 100 % 10) + (ticketNumber % 10);

        if (oddSum == evenSum){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}

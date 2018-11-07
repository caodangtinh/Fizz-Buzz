package com.tinhcao.fizzbuzz;

import com.tinhcao.fizzbuzz.step1.Step1;
import com.tinhcao.fizzbuzz.step2.Step2;
import com.tinhcao.fizzbuzz.step3.Step3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            choice = menu();
            switch (choice) {
                case 1:
                    Step1 step1 = new Step1();
                    step1.step1(getInputNumber());
                    break;
                case 2:
                    Step2 step2 = new Step2();
                    step2.step2(getInputNumber());
                    break;
                case 3:
                    Step3 step3 = new Step3();
                    step3.step3(getInputNumber());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Sorry, please enter valid Option");
            }
        }
    }


    public static int menu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("==========");
        System.out.println("1. Step 1");
        System.out.println("2. Step 2");
        System.out.println("3. Step 3");
        System.out.println("4. Exit");
        System.out.println("Enter your choice :");
        return keyboard.nextInt();
    }

    public static int getInputNumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your number: ");
            return scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Invalid number run with default 20");
            return 20;
        }
    }
}

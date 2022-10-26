package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = getName();
        System.out.println("\nHallo " + name);

        for(int i = 0; i < 5; i++){
            System.out.println(i + 1 + ": " + name);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eine Zahl: ");
        int number = scanner.nextInt();

        boolean answere = testNumber(number);
        if(answere) {
            System.out.println("\nJa, die Zahl " + number + " >= 0");
        }
        else {
            System.out.println("\nNein, die Zahl " + number + "  < 0");
        }

        System.out.print("Die Zahl, die quadriert werden soll: ");

        System.out.println("\nQuadratzahl: " + squareNumber(scanner.nextInt()));

    }
    static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie heisst Du? ");
        String name = scanner.next();
        return name;
    }

    static boolean testNumber(int number){
        if(number >= 0){
            return true;
        }
        return false;
    }

    static int squareNumber(int number){
        return number*number;
    }

}
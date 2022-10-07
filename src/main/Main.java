package main;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");

        try {
            int valoreIntero = in.nextInt();
            System.out.println("Valore: " + valoreIntero);
        } finally {
            System.out.println("SONO IN FINALLY!!!");
            in.close();
        }
    }
}
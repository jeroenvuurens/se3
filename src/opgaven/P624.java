package opgaven;

import java.util.Scanner;

/**
 *
 * @author Jeroen
 */
public class P624 {

    public static void main(String[] args) {
        int[][] seats = {{10, 10, 10, 10},
        {10, 10, 10, 10},
        {10, 20, 20, 10},
        {10, 30, 30, 10}};
        Scanner scanner = new Scanner(System.in);
        printSeats(seats);

        while (true) {
            System.out.print("Prijs: ");
            int prijs = scanner.nextInt();
            vindPrijs(seats, prijs);
            printSeats(seats);
        }
    }

    public static void printSeats(int[][] seats) {
        for (int rij = 0; rij < seats.length; rij++) {
            for (int col = 0; col < seats[rij].length; col++) {
                System.out.print(seats[rij][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void vindPrijs(int[][] seats, int prijs) {
        for (int rij = 0; rij < seats.length; rij++) {
            for (int col = 0; col < seats[rij].length; col++) {
                if (seats[rij][col] == prijs) {
                    seats[rij][col] = 0;
                    return;
                }
            }
        }
    }
}

package be.ses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Definieer het grid als een 1D lijst
        Iterable<Integer> grid = Arrays.asList(
            0, 0, 1, 0,
            1, 1, 0, 2,
            2, 0, 1, 3,
            0, 1, 1, 1
        );

        // Kies een index om te testen (bijv. index 5)
        int indexToCheck = 5;
        Iterable<Integer> neighbours = CheckNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, indexToCheck);

        // Print het resultaat
        System.out.println("Neighbours with the same value at index " + indexToCheck + ": " + neighbours);
    }
}

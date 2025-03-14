package be.ses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckNeighboursInGridTest {

    @Test
    void testNeighboursInMiddle() {
        List<Integer> grid = List.of(
            1, 3, 5,
            7, 3, 9,
            2, 8, 4
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 4;
    
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);
    
        assertIterableEquals(List.of(1), result); // Neighbour with value 3
    }
    
    @Test
    void testLeftEdge() {
        List<Integer> grid = List.of(
            1, 4, 7,
            1, 6, 2,
            1, 9, 3
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 3;
    
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);
    
        assertIterableEquals(List.of(0, 6), result); // Neighbours with value 1
    }
    
    @Test
    void testRightEdge() {
        List<Integer> grid = List.of(
            1, 4, 7,
            2, 5, 7,
            3, 8, 7
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 8;
    
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);
    
        assertIterableEquals(List.of(5), result); // Neighbour with value 7
    }
    
    @Test
    void testCornerElement() {
        List<Integer> grid = List.of(
            1, 2, 3,
            4, 5, 6,
            7, 8, 9
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 6;
    
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);
    
        assertIterableEquals(List.of(), result); // No neighbours with the same value
    }
    
    @Test
    void testNoSameNeighbours() {
        List<Integer> grid = List.of(
            1, 3, 5,
            7, 2, 9,
            4, 8, 6
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 1;
    
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);
    
        assertIterableEquals(List.of(), result); // No neighbours with the same value
    }
    
    @Test
    void testInvalidIndexThrowsException() {
        List<Integer> grid = List.of(
            1, 3, 5,
            7, 2, 9,
            4, 8, 6
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 10;
    
        Executable action = () -> CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);
    
        assertThrows(IllegalArgumentException.class, action); // Should throw exception
    }
    
}

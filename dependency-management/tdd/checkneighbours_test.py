import unittest
from checkneighbours import get_same_neighbours_ids

class TestFunctions(unittest.TestCase):
    def test_neighbours_in_middle(self):
        grid = [
            1, 3, 5,
            7, 3, 9,
            2, 8, 4
        ]
        width = 3
        height = 3
        index_to_check = 4

        result = get_same_neighbours_ids(grid, width, height, index_to_check)

        self.assertListEqual(list(result), [1])  # Neighbour with value 3

    def test_left_edge(self):
        grid = [
            1, 4, 7,
            1, 6, 2,
            1, 9, 3
        ]
        width = 3
        height = 3
        index_to_check = 3

        result = get_same_neighbours_ids(grid, width, height, index_to_check)

        self.assertListEqual(list(result), [0, 6])  # Neighbours with value 1

    def test_right_edge(self):
        grid = [
            1, 4, 7,
            2, 5, 7,
            3, 8, 7
        ]
        width = 3
        height = 3
        index_to_check = 8

        result = get_same_neighbours_ids(grid, width, height, index_to_check)

        self.assertListEqual(list(result), [5])  # Neighbour with value 7

    def test_corner_element(self):
        grid = [
            1, 2, 3,
            4, 5, 6,
            7, 8, 9
        ]
        width = 3
        height = 3
        index_to_check = 6

        result = get_same_neighbours_ids(grid, width, height, index_to_check)

        self.assertListEqual(list(result), [])  # No neighbours with the same value

    def test_no_same_neighbours(self):
        grid = [
            1, 3, 5,
            7, 2, 9,
            4, 8, 6
        ]
        width = 3
        height = 3
        index_to_check = 1

        result = get_same_neighbours_ids(grid, width, height, index_to_check)

        self.assertListEqual(list(result), [])  # No neighbours with the same value

    def test_invalid_index_throws_exception(self):
        grid = [
            1, 3, 5,
            7, 2, 9,
            4, 8, 6
        ]
        width = 3
        height = 3
        index_to_check = 10

        with self.assertRaises(ValueError):
            get_same_neighbours_ids(grid, width, height, index_to_check)

if __name__ == '__main__':
    unittest.main()

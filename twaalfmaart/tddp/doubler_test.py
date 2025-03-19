import unittest
from unittest.mock import patch
from doubler import double_calculator

class TestCalculator(unittest.TestCase):
    @patch("doubler.divide")  # Mock de geïmporteerde `divide` functie in `doubler.py`
    def test_gegevenOperationDivideX2Y1_wanneerDoubleCalculator_danResultIs4(self, mock_divide):
        # Arrange
        # De mock werd meegegeven als parameter en je stelt nu de return value in
        mock_divide.return_value = 2.0
        
        # Act
        result = double_calculator(mock_divide, 2, 1)
        
        # Assert
        self.assertEqual(result, 4.0)
        
        # Verifieer dat `divide` werd aangeroepen met (2, 1)
        mock_divide.assert_called_once_with(2, 1)

if __name__ == "__main__":
    unittest.main()
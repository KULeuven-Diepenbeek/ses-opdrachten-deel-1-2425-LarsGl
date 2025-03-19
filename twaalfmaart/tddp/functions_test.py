import unittest
from functions import max_in_list, factorial, is_even, count_positive, is_prime

class TestFunctions(unittest.TestCase):
    def test_gegeven3en5en2_wanneerMaxInList_dan5(self):
        self.assertEqual(max_in_list([3, 5, 2]), 5)
    
    def test_gegevenMin1enMin5enMin3_wanneerMaxInList_danMin1(self):
        self.assertEqual(max_in_list([-1, -5, -3]), -1)

    def test_gegeven0_wanneerFactorial_dan1(self):
        self.assertEqual(factorial(0), 1)
        
    def test_gegeven5_wanneerFactorial_dan120(self):
        self.assertEqual(factorial(5), 120)

    def test_gegeven4_wanneerIsEven_danTrue(self):
        self.assertTrue(is_even(4))
    
    def test_gegeven5_wanneerIsEven_danFalse(self):
        self.assertFalse(is_even(5))

    def test_gegevenMin1en0en5_wanneerCountPositive_dan1(self):
        self.assertEqual(count_positive([-1, 0, 5]), 1)
    
    def test_gegevenMin2enMin3_wanneerCountPositive_dan0(self):
        self.assertEqual(count_positive([-2, -3]), 0)

    def test_gegeven4en5en6_wanneerCountPositive_dan3(self):
        self.assertEqual(count_positive([4, 5, 6]), 3)

    def test_gegeven1_wanneerIsPrime_danFalse(self):
        self.assertFalse(is_prime(1))

    def test_gegeven2_wanneerIsPrime_danTrue(self):
        self.assertTrue(is_prime(2))

    def test_gegeven3_wanneerIsPrime_danTrue(self):
        self.assertTrue(is_prime(3))

    def test_gegeven4_wanneerIsPrime_danFalse(self):
        self.assertFalse(is_prime(4))

    def test_gegeven9_wanneerIsPrime_danFalse(self):
        self.assertFalse(is_prime(9))

    def test_gegeven11_wanneerIsPrime_danTrue(self):
        self.assertTrue(is_prime(11))

if __name__ == '__main__':
    unittest.main()
import unittest
from demo import divide

class DemoTest(unittest.TestCase):
    def test_gegevenTeller2Noemer1_wanneerDivide_danResult2(self):
        result = divide(2, 1)
        self.assertEqual(result, 2)  # Let op: 2/1 = 2, dus deze test zal falen!

if __name__ == "__main__":
    unittest.main()
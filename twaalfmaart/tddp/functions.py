def max_in_list(lst):
    max_val = lst[0]
    for num in lst:
        if (num > max_val):  
            max_val = num
    return max_val

def factorial(n):
    if n < 0:
        raise ValueError("Factorial is not defined for negative numbers")
    if n == 0:
        return 1
    result = 1
    for i in range(1, n + 1):
        result =result*i
    return result


def is_even(num):
    return num % 2 == 0  

def count_positive(numbers):
    count = 0
    for num in numbers:
        if num > 0:  
            count=count+1
    return count

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):  # +1 om het eindpunt te includeren
        if n % i == 0:
            return False
    return True

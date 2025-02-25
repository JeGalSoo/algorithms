n = int(input())
numbers = list(map(int, input().split()))[:n]

def is_prime(num):
    """소수 판별 함수"""
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

prime_count = sum(1 for num in numbers if is_prime(num))

print(prime_count)
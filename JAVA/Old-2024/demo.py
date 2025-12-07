import math

# Start from 5
number = 5

# Loop until the square root is greater than 50
while True:
    sqrt_value = math.sqrt(number)
    if sqrt_value > 50:
        break
    print(f"The square root of {number} is {sqrt_value}")
    number += 1

test_cases = int(input())

for n in range(test_cases):
    integer = int(input())

    if integer % 2 == 0:
        print(str(integer) + " is even")
    else:
        print(str(integer) + " is odd")


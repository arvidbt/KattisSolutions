cases = int(input())
for i in range(cases):
    x, y, z = [int(x) for x in input().split(" ")]

    if x + y == z:
        print("Possible")
    elif (x - y == z) or (y - x == z):
        print("Possible")
    elif ((x / y) == z) or ((y / x) == z):
        print("Possible")
    elif (x * y) == z:
        print("Possible")

    else:
        print("Impossible")

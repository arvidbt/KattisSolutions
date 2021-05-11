number_of_steelrods = int(input())
x = 0
for i in range(number_of_steelrods):
    x += int(input())
    if i > 0:
        x -= 1
print(x)
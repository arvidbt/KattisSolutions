x = int(input())
print_this = 0
for n in range(x):
    x, y = [float(x) for x in input().split(" ")]
    print_this += x * y

print("%.3f" % print_this)


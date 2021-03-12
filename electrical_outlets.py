x = [int(x) for x in input().split(" ")]
total = 0
for ele in range(1, len(x)):
    total = total + x[ele]
total = total - x[0] + 1

print(total)

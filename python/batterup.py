x = int(input())
y = [int(x) for x in input().split(" ")]
total = 0
for ele in range(0, len(y)):
    if y[ele] == - 1:
        x = x - 1
    
    else:
        total = total + y[ele]

print(total/x)

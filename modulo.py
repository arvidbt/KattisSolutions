x = [ ]
for n in range(0, 10):

    ele = int(input()) % 42
    x.append(ele)

print(len(set(x)))
l1 = [1,1,2,2,2,8]
l2 = [int(l2) for l2 in input().split(" ")]

out = ""
for i, v in enumerate(l2):
    out += str(l1[i] - v) + " "

print(out.rstrip())
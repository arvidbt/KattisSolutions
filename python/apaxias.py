name = input()
slim_shady = [name[0]]

for i in range(1, len(name)):
    temp = name[i]
    if temp == name[i - 1]:
        continue
    else:
        slim_shady.append(temp)

print("".join(map(str,slim_shady)))

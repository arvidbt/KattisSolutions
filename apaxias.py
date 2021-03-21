word = input()
used = []
name = []

for i in range(len(word)):
    if word[i] in used:
        continue
    else:
        name[i].append(word[i])

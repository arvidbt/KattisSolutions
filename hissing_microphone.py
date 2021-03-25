word = input()
hiss = False

for i in range(len(word)-1):
    if word[i] == 's' and word[i+1] == 's':
        hiss = True
        break

if(hiss == True):
    print("hiss")

else:
    print("no hiss")
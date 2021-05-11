y, p = input().split(" ")
vowels = ('a', 'e', 'i', 'o', 'u')
ex     = ('ex')
e      = ('e')
y_len = len(y)

if y.endswith(e):
    print(y+'x'+p)

elif y.endswith(vowels):
    s = ""
    for i in range(y_len-1):
        s+=y[i]
    print(s+"ex"+p)

elif y.endswith(ex):
    print(y+p)

else:
    print(y+"ex"+p)
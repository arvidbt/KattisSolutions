cases = int(input())
says = "Simon says"

for i in range(cases):
    simon = input()
    if says in simon:
        ape = simon.replace('Simon says ', '')
        print(ape)

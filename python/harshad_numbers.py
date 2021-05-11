number = int(input())
number_as_string = str(number)
while(True):
    x = 0

    for i in range(len(number_as_string)):
        x += int(number_as_string[i])

    if number % x == 0:
        print(number)
        break
    else:
        number += 1
        number_as_string = str(number)
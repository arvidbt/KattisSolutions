moves = input()
cup_of_a = 0
cup_of_b = 0
cup_of_c = 0

for i in range(len(moves)):

    if moves[i] == 'A' and i % 2 == 0:
        cup_of_a += 1
    elif moves[i] == 'A' and i % 2 == 1:
        cup_of_a -= 1

    if moves[i] == 'B' and i % 2 == 1:
        cup_of_b -= 1
    elif moves[i] == 'B' and i % 2 == 0:
        cup_of_b += 1

    if moves[i] == 'C' and i % 3 == 0:
        cup_of_c -= 1
    elif moves[i] == 'C' and i % 3 == 1 or i % 3 == 2:
        cup_of_c += 1

print(cup_of_a + cup_of_b + cup_of_c)
rooms = int(input())
teams = int(input())


if rooms == 1:
    print("*" * teams)
    exit()

rest = teams % rooms
if rest == 0:
    rooms += 1

big_rooms_boys = int((teams - rest)/2)
if rest == 0:
    big_rooms_boys = int(big_rooms_boys / 2)

for i in range(rooms-1):
    print("*" * int(big_rooms_boys))

print("*" * rest)

visited = []
path = []
walls = []
solved_maze = False
x = 0
y = 0

print("right")
visited.append([0,0])

if (x, y) in visited:

while not solved_maze:
    answer = input()

    if answer == "ok":
        path.append([x+1, y])

    if answer == "wall":
        walls.append([x+1, y])

    if answer == "solved":
        exit()

    if answer == "wrong":
        exit()

# righthand rule
# Höger, ner, vänster, upp
# börja på (0,0)

# 1. Kolla höger
#   1.1 Om ok
#       1.1.1 push:a till stack ( path )-> (x+1, y)

#   1.2 Kolla höger, ner, INTE VÄNSTER, upp
#       1.2.1 "if not wall and not visited"
#
#   2.1 Om wall
#       2.1.1 Lägg till (x+1, y) till walls.
#   
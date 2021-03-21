import random
import sys

def get_move(x, y, blocked_paths):
    moves = [[x - 1, y], [x + 1, y], [x, y - 1], [x, y + 1]]
    while moves:
        move = random.choice(moves)
        if [[x,y], move] in blocked_paths:
            moves.remove(move)
        else:
            return [move[0]-x, move[1]-y]

solved = False
move_thing = [[-1, 0], [1, 0], [0,-1], [0,1]]
move_word = ["left", "right", "down", "up"]

print('down')

x=0
y=0
dir = [0, -1]
blocked_paths = []

while not solved:
    a = input()
    if a == 'solved':
        solved = True
        exit()

    if a == 'wall':
        blocked_paths.append([[x, y], [x + dir[0], y + dir[1]]])
        blocked_paths.append([[x + dir[0], y + dir[1]],[x, y]])
    if a == 'wrong':
        exit()

    elif a == 'ok':
        x, y = [x + dir[0], y + dir[1]]

    dir = get_move(x, y, blocked_paths)
    if dir == [0, 0]:
        print('no way out')
        exit()
    word = move_word[move_thing.index(dir)]

    print(word)
    sys.stdout.flush()

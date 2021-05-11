#x, y, z = [int(x) for x in input().split(" ")]
width = int(input())
shattered_pieces = int(input())
big_piece = 0
for i in range(shattered_pieces):
    width_piece, length_piece = [int(x) for x in input().split(" ")]
    big_piece += width_piece*length_piece

print(int(big_piece/width))
point_1 = [int(x) for x in input().split(" ")]
point_2 = [int(x) for x in input().split(" ")]
point_3 = [int(x) for x in input().split(" ")]
point_4_x = 0
point_4_y = 0

if point_1[0] == point_2[0] or point_1[0]==point_3[0]:
    if point_1[0] == point_2[0]:
           point_4_x = point_3[0]
    else:
           point_4_x = point_2[0]
else:
    point_4_x = point_1[0]

if point_1[1] == point_2[1] or point_1[1]==point_3[1]:
    if point_1[1] == point_2[1]:
           point_4_y = point_3[1]
    else:
           point_4_y = point_2[1]
else:
    point_4_y = point_1[1]

print(point_4_x, point_4_y)
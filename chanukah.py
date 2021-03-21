num_data_sets = int(input())

data_set = []
for i in range(num_data_sets):
    data_set.append([int(x) for x in input().split(" ")])

total = 0
for i in range(len(data_set)):
    days = data_set[i][1]
    for j in range(days + 2):
        total = total + j
    print(i+1, total - 1)
    total = 0

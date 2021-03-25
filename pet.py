i1 = [int(x) for x in input().split(" ")]
i2 = [int(x) for x in input().split(" ")]
i3 = [int(x) for x in input().split(" ")]
i4 = [int(x) for x in input().split(" ")]
i5 = [int(x) for x in input().split(" ")]

deltagare = [i1, i2, i3, i4, i5]

score1 = 0
score2 = 0
score3 = 0
score4 = 0
score5 = 0

scores = [score1, score2, score3, score4, score5]
for i in range(5):
    scores[i] = sum(deltagare[i])
    

print(scores.index(max(scores)) +1 , max(scores))


    

test_cases = int(input())
sum_all = 0

for n in range(test_cases):
    number = int(input())
    exp = number % 10
    new_number = number // 10
    sum_all += pow(new_number, exp)
print(sum_all)
test_cases = int(input())

for i in range(test_cases):
    revenue, expected_revenue, cost = [int(x) for x in input().split(" ")]
    if (expected_revenue - cost) > revenue:
        print("advertise")
    if (expected_revenue - cost) < revenue:
        print("do not advertise")
    elif (expected_revenue - cost) == revenue:
        print("does not matter")
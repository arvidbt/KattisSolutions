test_cases = int(input())
cities = []

for i in range(test_cases):
    num_of_cities = int(input())
    cities = []
    for j in range(num_of_cities):
        cities.append(input())
    print(len(set(cities)))

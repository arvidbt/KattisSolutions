n, m = map(int, input().split())

jack = set()
jill = set()

for _ in range(n):
    jack.add(int(input()))

for _ in range(m):
    jill.add(int(input()))

print(jack.intersection(jill))

DOES NOT WORK

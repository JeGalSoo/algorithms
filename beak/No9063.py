a = []
b = []
for _ in range(int(input())):
    x, y = map(int, input().split())
    a.append(x)
    b.append(y)

print((max(a)-min(a))*(max(b)-min(b)))
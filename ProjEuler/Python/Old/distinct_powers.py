total = set()

for a in range(2,101):
    for b in range(2,101):
        total.add(a**b)

print(len(total))

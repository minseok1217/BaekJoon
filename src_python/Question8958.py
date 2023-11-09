t = int(input())
for i in range(t):
    score = 0
    point = 1
    ch = input()
    for j in ch:
        # OX
        if j == 'O':
            score += point
            point += 1
        else:
            point = 1
    print(score)
while(True):
    a = input()

    if a == '0':
        break
    b = ''.join(reversed(a))
    if a == b:
        print('yes')
    else:
        print('no')

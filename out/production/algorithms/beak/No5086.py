while True:
    x, y = map(int, input().split())
    if x==0 and y==0:
        break
    elif x>y:
        print('multiple' if x%y==0 else 'neither')
    elif x<y:
        print('factor' if y%x==0 else 'neither')
    else :
        print('neither')
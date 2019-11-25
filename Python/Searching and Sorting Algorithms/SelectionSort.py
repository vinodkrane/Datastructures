list = [8,2,7,3,6,4,1,5]

for i in range(len(list)):
    imin = i

    for j in range(i+1,len(list)):
        if list[imin]>list[j]:
            imin=j

    temp = list[imin]
    list[imin] = list[i]
    list[i] = temp
print(list)
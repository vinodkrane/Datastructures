#list = [8,2,7,3,6,4,1,5]
list = [2, 1, 3, 4, 5, 6, 7, 8]

for i in range(0,len(list)-1):
    isSwapped = 0
    for j in range(len(list)-1):
        if list[j+1] < list[j]:
            temp = list[j+1]
            list[j + 1] = list[j]
            list[j] = temp
            isSwapped = 1

    if isSwapped ==0:
        break
print(list)
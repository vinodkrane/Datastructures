def binary_search(item_list, item):
    first = 0
    last = len(item_list) - 1

    while (first <= last):
        mid = (first + last) // 2
        if item_list[mid] == item:
            return True
        else:
            if item < item_list[mid]:
                last = mid - 1
            else:
                first = mid + 1
    return False


print(binary_search([1, 2, 3, 5, 8], 6))
print(binary_search([1, 2, 3, 5, 8], 5))
# a=[0,9,3,8,2,7,5]
# pivot = 5 
def quick_sort(sequence):
    length = len(sequence)
    if length <= 1:
        return sequence
    else:
        pivot = sequence.pop()  
        # removes the last element and returns it 
    items_greater = []
    items_lower= []

    for item in sequence:
        if item > pivot:
            items_greater.append(item)
        else:
            items_lower.append(item)
    return quick_sort(items_lower)+[pivot]+quick_sort(items_greater)
print(quick_sort([5,6,4,3,7,98,2,4,6,2,4,5,8,8,9]))

        

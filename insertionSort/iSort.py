

def insertion_sort(list_a):

    indexingLength = range(1,len(list_a))

    for i in indexingLength:
        
        value_to_sort = list_a[i]
        # while item to the left is higher than value of the item to the right
        while list_a[i-1] > value_to_sort and i>0:
        # swapping vlues like a,b = b,a 
            list_a[i],list_a[i-1] = list_a[i-1],list_a[i] 
            
            # loooking to the next items 
            i=i-1

    return list_a
print(insertion_sort([1,5,67,7,34,6,8,7,4,2,2,4,6,8,8,5,3,2]))
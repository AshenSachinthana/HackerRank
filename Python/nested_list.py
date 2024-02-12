my_list = []
N = int(input())

for i in range(N):
    temp_list = []
    for j in range(2):
        if j == 0:
            element = input()  # First element
        else:
            element = float(input())  # Second element
        temp_list.append(element)
    my_list.append(temp_list)

# Sort
my_list.sort(key=lambda x: x[1])

lowest = float('inf')
second_lowest = float('inf')

for _, value in my_list:
    #lowest and second lowest elements
    if value < lowest:
        second_lowest = lowest
        lowest = value
    elif value < second_lowest and value != lowest:
        second_lowest = value

#Extract all
second_lowest_elements = [sublist for sublist in my_list if sublist[1] == second_lowest]
sorted_nested_list = sorted(second_lowest_elements, key=lambda x: x[0])

for sublist in sorted_nested_list:
    print(sublist[0])

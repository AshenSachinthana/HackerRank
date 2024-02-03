x = int(input())
y = int(input())
z = int(input())
n = int(input())

x_list = list(range(0, x+1))
y_list = list(range(0, y+1))
z_list = list(range(0, z+1))

result = [[x, y, z] for x in x_list for y in y_list for z in z_list]

selected_lists = [inner_list for inner_list in result if sum(inner_list) != n]
print(selected_lists)


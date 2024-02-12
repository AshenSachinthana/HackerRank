# number of scores
n = int(input())

# scores convert them to integers
scores = list(map(int, input().split()))

# Remove duplicates
unique_scores = list(set(scores))

# Bubble sort 
for i in range(len(unique_scores)):
    for j in range(len(unique_scores) - 1):
        if unique_scores[j] < unique_scores[j + 1]:
            unique_scores[j], unique_scores[j + 1] = unique_scores[j + 1], unique_scores[j]

# second element from the sorted list
print(unique_scores[1])


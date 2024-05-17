num_students = int(input())

students = []

for _ in range(num_students):
    input_data = input().strip()
    
    parts = input_data.split()
    
    name = parts[0]
    
    marks = list(map(float, parts[1:4]))
    
    students.append([name, marks])

selected_student = input().strip()

for student in students:
    if student[0] == selected_student:
        average_marks = sum(student[1]) / len(student[1])
        print(f"{average_marks:.2f}")
        break
else:
    print(f"Student named not found.")

largest = 0;
smallest = 0;

sum_of_numbers = 0;
for index in range (1,6):
	number = int(input("Enter a number: "))

	if index == 1:
		largest = number
		smallest = number


	elif number > largest:
		largest = number

	elif number < smallest:
		smallest = number


sum_of_numbers = smallest + largest

print(sum_of_numbers)


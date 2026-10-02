
for row in range (1,11):

	for column in range (1, (row + 1)):

		print("*", end="")


	print()

print()
print()

for row in range (10,0,-1):

	for column in range (1, (row + 1)):

		print("*", end="")

	print()

print()
print()

row = 0
for row in range (10,0,-1):

	for column in range (1, (row + 1)):

		print("*", end="")

	print()

	for space in range (12, (row + 1), -1):
		print(' ', end="")


print()
print()

for row in range (1,11):

	for space in range (11, (row + 1), -1):
		print(' ', end="")

	for column in range (1, (row + 1)):

		print("*", end="")


	print()

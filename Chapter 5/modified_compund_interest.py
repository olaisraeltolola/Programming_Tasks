amount = 0.0;
principal = 1000.0;

for year in range (1,11):
	for rate in range(5, 11):

		amount = principal * ((1.0 + (rate/100.0))**year);

		print(f"year = {year}\trate = {rate}\tamount = {amount:.2f}")

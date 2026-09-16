import java.util.Scanner;
	
public class FactorsOfNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int numberOne = input.nextInt();

int counter = 0;
int index = 2;
for (; index <= numberOne; index++){
if (index % index == 0)
counter ++;
if (numberOne <= 1)
counter++;

int dividedNumber = numberOne % index;

if (counter == 2  & dividedNumber % index == 0)
System.out.println(index);
}
}
}



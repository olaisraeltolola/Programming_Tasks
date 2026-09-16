import java.util.Scanner;
	
public class LCMOfTwoNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
int numberOne = input.nextInt();

System.out.println("Enter the second number");
int numberTwo = input.nextInt();

int index = 2;
int product = 1;

while (numberOne != 1 && numberTwo != 1){

if (numberOne % index == 0 && numberTwo % index != 0)
numberOne = numberOne / index;

if (numberOne % index != 0 && numberTwo % index == 0)
numberTwo = numberTwo / index;

product = product * index;

if (numberOne % index != 0 && numberTwo % index != 0)
index++;


System.out.println(product);
}
}
}


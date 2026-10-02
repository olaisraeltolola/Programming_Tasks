import java.util.Scanner;
public class Extremes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

int largest = 0;
int smallest = 0;

int sum = 0;
for (int index = 1; index <= 5; index++){

	System.out.println("Enter a number: ");
	int number = input.nextInt();

if (index == 1){
largest = number;
smallest = number;
}

else if (number > largest)
largest = number;

else if (number < smallest)
smallest = number;

}
sum = smallest + largest;

System.out.println(sum);
}
}
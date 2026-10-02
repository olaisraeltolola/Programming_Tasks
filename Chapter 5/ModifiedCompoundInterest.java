public class ModifiedCompoundInterest{

	public static void main(String[] args){

double amount = 0;
double principal = 1000.0;

for (int year = 1; year <= 10; year++){
	for (int rate = 5; rate <= 10; rate++){

amount = (principal * Math.pow(1.0 + (rate/100.0), year));

System.out.printf("year = %d\trate = %d\tamount = %.2f%n",year,rate,amount);
}
}
}
}
public class TrianglePrintingProgram{

	public static void main(String[] args){

for (int row = 1; row <= 10; row++){

	for (int column = 1; column <= row; column++){

System.out.print("*");

}
System.out.println();
}
System.out.println();
System.out.println();

for (int row = 10; row >= 1; row--){

	for (int column = 1; column <= row; column++){

System.out.print("*");

}
System.out.println();
}

System.out.println();
System.out.println();

int row = 0;
for (row = 10; row >= 1; row--){

	for (int column = 1; column <= row; column++){

System.out.print("*");

}
System.out.println();

for (int space = 10; space >= row; space--)
System.out.print(' ');


}


System.out.println();
System.out.println();

for (row = 1; row <= 10; row++){

for (int space = 10; space >= row; space--)
System.out.print(' ');

	for (int column = 1; column <= row; column++){

System.out.print("*");

}
System.out.println();

}







}
}
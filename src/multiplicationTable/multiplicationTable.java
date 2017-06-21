package multiplicationTable;
import java.util.Scanner;
public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberToMultiply = 0;
		int numberOfTimes = 0;
computation table;
table = new computation();
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the number to make the table for");
numberToMultiply =keyboard.nextInt();
System.out.println("Enter the number of rows");
numberOfTimes =keyboard.nextInt();
table.multiply(numberToMultiply,numberOfTimes);

	}

}

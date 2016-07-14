# oddoreven
import java.util.Scanner;
public class Check {
public static void main(String args[]){
	System.out.println("Enter positive number");
	Scanner input=new Scanner(System.in);
	int number=input.nextInt();
	if(number%2==0){
		System.out.println("The number is even");
	}
	else
		System.out.println("The number is odd");

	}
}


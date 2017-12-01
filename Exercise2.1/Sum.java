import java.util.Scanner;
public class Sum {
	
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		
		// grabber the users number input
		System.out.print("Enter a positive Integer: ");
		int a;
		a = in.nextInt ();
		
		//asking for positive integer again
		if (a <=0)
			System.out.print("Please enter a positive Integer: ");
		a = in.nextInt ();
		
		if (a  >=0)
		// calculations of positive integer
			{	int sum = 0;
				while (a != 0) {//sum of digits 
								sum += a % 10;
					            //subtract the last digit
								a /= 10;}
				System.out.println("Sum of even integer: " + sum);
			
		}
	}	
}

import java.util.Scanner;
public class temperature {

	public static void main(String[] args){
		float temperature;
		Scanner in = new Scanner (System.in);
		
		//ask user for input
		System.out.print("Enter Temperature in Fahrenheit: ");
		temperature = in.nextInt();
		//converting Fahrenheit to Celsius
		temperature = ((temperature - 32)*5)/9;
		
		//results
		System.out.println("Temperature in Celsius = " + temperature);
		
		//ask user for input
		System.out.print("Enter Temperature in Celsius: ");
		temperature = in.nextInt();
		//converting Celsius to Fahrenheit
		temperature = ((temperature *9)/5)+32;
				
		//results
		System.out.println("Temperature in Fahrenheit = " + temperature);
		
		

	}
}

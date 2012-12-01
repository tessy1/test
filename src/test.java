import java.util.Scanner;
public class test {
	public static void main(String[] args)
	  {
	   Scanner scan = new Scanner(System.in);
	   double cost, paidAmount;
	   System.out.println("Please enter the cost:");
	   cost = scan.nextDouble();

	   int dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;

	   System.out.println("Please enter the paid amount:");
	   paidAmount = scan.nextDouble();

	   double change = ((paidAmount - cost)*100.0);
	   change = Math.ceil(change);
	   System.out.println(change);
	   if(change > 0)
	   {
		   dollars=(int) (change/100);

		   change = change%100;

		   quarters = (int) (change/25);

		   change = change%25;

		   dimes = (int) (change/10);

		   change = change%10;

		   nickles = (int) (change/5);

		   pennies = (int) (change%5);

	  }
       
	   System.out.println("Dollars =" + dollars);
	   System.out.println("Quarters=" + quarters);
	   System.out.println("Dimes =" + dimes);
	   System.out.println("Nickles =" + nickles);
	   System.out.println("Pennies =" + pennies);
	   


	  }}


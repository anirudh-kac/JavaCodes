import java.util.*;

public class CoinChange {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of denominations :");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the values of the coins in descending order:");
		//Alter : Sort array a after taking inputs in any order
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("Enter total amount : ");
		int c = in.nextInt();
		//System.out.println("Value of c is " + c);
		
		//
		int numcoins[] = new int[n];
		for(int i = 0;i<n;i++) numcoins[i] = 0;
		
		for(int i = 0;i<n ;i++) {
			
			if(c>= a[i])
			{
				while(c>=a[i])
				{
					c-= a[i];
					numcoins[i]++;
				}
			}
		}
		
		if(c!=0) {
			System.out.println("Solution doesn't exist");
		}else {
			System.out.println("The change can be produced as :");
			for(int i = 0;i<n;i++) {
				System.out.println( a[i] + " : " + numcoins[i]);
			}
		}
	}
}

import java.util.*;
public class FractionalKnapsack {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of objects :");
		int n = in.nextInt(); 
		
		double weights[] = new double[n];
		double profits[] = new double[n];
		
		System.out.println("Enter weights :");
		for (int i=0;i<n;i++) {
			weights[i] = in.nextInt();
			}
		
		System.out.println("Enter corresponding profits:");
		for (int i=0;i<n;i++) {
			profits[i] = in.nextInt();
			}
		
		System.out.println("Enter Knapsack Capacity");
		double m = in.nextDouble();
		
		
		//profit per unit weight
		double pw[] = new double[n];
		
		for(int i = 0;i<n;i++) {
			pw[i] = profits[i]/weights[i];
		}
		
		double profit = 0;
		
		while(m>0)
		{
			//index corresponding to max profit per weight
			int index = 0;
			double max = pw[index];
			for(int i=1;i<n;i++) {
				if(pw[i]>max && weights[i]>0) {
					max = pw[i];
					index = i;
				}
			}
			
			if(weights[index]==0) break;
			
			double c;
			if(weights[index]>m) {
				c = m;
			}else {
				c = weights[index];
			}
			
			weights[index]-=c;
			m-=c;
			profit+= pw[index]*c;
		}
			
		System.out.println("Max profit is : "+profit);
	}
}

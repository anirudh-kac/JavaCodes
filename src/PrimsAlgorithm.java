import java.util.*;
public class PrimsAlgorithm {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int n = in.nextInt();
		int a[][]= new int[n][n]; // Array to store matrix 
		int added[] = new int[n]; // 0 if vertex is added to tree , else 1
		for(int i=0;i<n;i++) added[i] = 0;
		//Take input (Infinity treated as 9999 or above )
		System.out.println("Enter the weighted matrix");
		for(int i = 0;i<n;i++) {
			for(int j =0 ;j<n;j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Enter source vertex");
		int source = in.nextInt();
		added[source] = 1; // Source added to tree
		int u=source,v=source; // Random initialization  (u,v) represents the edge
		int visited =1; // total number of visited vertices(added vertices)
		int cost = 0;
		while(visited <n) {
			//while all vertices not added
			//Note : instead of while loop , a for loop can be used that runs n-1 times
			//A vertex is added in every iteration
			int min = 999;
			for(int i =0 ;i<n;i++) {
				if(added[i]==0) continue; // i should belong to tree i.e it should be added
				for(int j = 0;j<n;j++) {
					if(added[j]==1) continue; // j should belong to not added vertices
					if(a[i][j]<=min) {
						// if weight is min , select edge (i,j) as (u,v)
						u = i;
						v = j;
						min = a[i][j];
					}
				}
			}
			// v is added to the tree now
			added[v] =1;
			//number of vertices increased by 1
			visited++;
			//update cost
			cost+= a[u][v];
			//print edge (u,v)
			System.out.println(u + ">" + v);
		}
		System.out.println("Cost is" + cost);
	}
}

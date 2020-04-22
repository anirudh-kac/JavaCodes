import java.util.*;
public class HeapBottomUp {
	//Look for HeapSortExample.java for function example
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of elements");
		int n = in.nextInt();
		int H[] = new int[n+1];
		H[0] = 9999; //Sentinel Value
		System.out.println("Enter the elements");
		for (int i = 1;i<=n;i++) {
			H[i] = in.nextInt();
		}
		
		for ( int i = n/2;i>=1;i--) {
			// starting from last parent (it's at n/2) till the root
			
			int k =i; // k is the node we're checking the dominance of
			int v = H[k]; // value of the node
			
			boolean heap = false; // heap is not formed yet
			
			while(!heap && 2*k<=n) {
				// while heap is not formed and the node has a child
				int j = 2*k; // the left child is at j
				
				if(j<n) {
					if(H[j] < H[j+1]) j = j+1;
				}
				// compare left child and right child to find the bigger child
				
				if (v>=H[j])
					heap=true; // if value of node at k is bigger than the max of two children , heap properrty satisfied
				else {
					H[k] = H[j]; //Value of parent becomes value of greater child
					k=j; // Now check for dominance of the child node , if it also has children
					
				}
				H[k]=v; //  Value of child becomes value of parent if swapped , else this statement has no effect
				
			}
		}
		
		for (int i = 1;i<=n;i++) {
			System.out.println(H[i]);
		}
		
	}
}

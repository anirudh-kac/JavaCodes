import java.util.*;
public class HeapSortExample {
	
	static void makeHeap(int H[],int n) {
		for(int i = n/2;i>=1;i--) {
			boolean heap=false;
			int k = i;
			int v =H[k];
			while(!heap & 2*k<=n) {
				int j = 2*k;
				if(j<n) {
					//Only if both children exist j<n
					if(H[j+1]>H[j]) {
						j=j+1;
					}
				}
				
				if(H[j]<v) {
					heap=true;
				}else {
					H[k] = H[j];
					k=j;
				}
				H[k] = v;
			}
		}
	}
	

	static void heapSort(int H[],int n) {
		int N = n;
		makeHeap(H,n);
		for(int i=0;i<N;i++) {
			int max = H[1];
			H[1] = H[n];
			H[n] = max;
			n--;
			makeHeap(H,n)
		}
		
	}
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = in.nextInt();
		int a[] = new int[n+1];
		a[0] = 999;
		System.out.println("Enter elements");
		for(int i =1;i<=n;i++) {
			a[i] = in.nextInt();
		}
		
		heapSort(a,n);
		
		for(int i=1;i<=n;i++) {
			System.out.println(a[i]);
		}
		in.close();
		
	}
}

package Sorting;

public class Bubble_Sort {
	
	public static void main(String[] args) {
		
		int array[] = {2, 1, 8, -3, 6, 4, 12};
		int n = array.length;
		
		System.out.println("The array before sorting is :");
		
		for(int item:array) {
			
			System.out.print(item+ " ");
			
		}
		
		System.out.println();
		for(int i = 0; i < n-1-i; i++) {//optimization No #1
			/*This n-1-i is the optimized solution of n-1 what is does is 
			 *it does not repeat the sorted element every time
			 *The rule is with every step the largest element gets sorted
			 *and this element is iterated every time
			 *So we reduce the looping by subtracting i from it so it does
			 *not repeat the sorted elements every time.*/
			
			boolean sorted = true;//Optimization No #2
			/*What this does is; It is not necessary that the array will
			 *be only sorted after n-2. It can get sorted in the second 
			 *iteration itself. But the loop will keep on going for 
			 *n-1 times. This condition checks it the swap loop is not 
			 *executed means the array is sorted so it breaks from there*/
			
			for(int j = 0; j < n-1; j++) {
				
				if(array[j]>array[j+1]) {
					
					int temp = array[j];
					array[j] = array[j+1];
					array [j+1] = temp;
					sorted=false;
				}
				
			}
			
			if(sorted)break;
			
		}
		
		System.out.println("The array after sorting is :");
		
		for(int k : array) {
			
			System.out.print(k+ " ");
			
		}
		
	}

}

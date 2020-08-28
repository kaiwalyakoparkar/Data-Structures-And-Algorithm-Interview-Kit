package Sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		
		int array[] = {2, 1, 8, -3, 6, 4, 12};
		int n = array.length;
		
		
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j = i; j<n; j++) {
				
				if(array[j]<array[min]) {
					min=j;
				}
				
			}
			int temp =array[i];
			array[i] =array[min];
			array[min] = temp;
			
		}
		for(int item:array) {
			
			System.out.print(item+" ");
			
		}
		
	}
	
}

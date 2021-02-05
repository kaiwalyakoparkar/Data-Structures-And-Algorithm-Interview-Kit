package CommonElementInThreeSortedArrays;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int arr3[] = new int[n3];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < arr3.length; i++){
            arr3[i] = sc.nextInt();
        }

        //This is bruteforce approach
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0 ;j < arr2.length; j++){
                for(int k = 0; k < arr3.length; k++){
                    if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                        li.add(arr1[i]);
                    }
                }
            }
        }
        System.out.println("The common elements are : ");
        for(int i = 0; i < li.size(); i++){
            System.out.print(li.get(i)+" ");
        }

        //This is better approach
        // creating a max variable
        // for storing the maximum
        // value present in the all
        // the three array
        // this will be the size of
        // array for calculating the
        // frequency of each element
        // present in all the array
        int max = Integer.MIN_VALUE;

        // deleting duplicates in linear time
        // for arr1
        int res1 = 1;
        for (int i = 1; i < n1; i++)
        {
            max = Math.max(arr1[i], max);
            if (arr1[i] != arr1[res1 - 1])
            {
                arr1[res1] = arr1[i];
                res1++;
            }
        }

        // deleting duplicates in linear time
        // for arr2
        int res2 = 1;
        for (int i = 1; i < n2; i++)
        {
            max = Math.max(arr2[i], max);
            if (arr2[i] != arr2[res2 - 1])
            {
                arr2[res2] = arr2[i];
                res2++;
            }
        }

        // deleting duplicates in linear time
        // for arr3
        int res3 = 1;
        for (int i = 1; i < n3; i++)
        {
            max = Math.max(arr3[i], max);
            if (arr3[i] != arr3[res3 - 1])
            {
                arr3[res3] = arr3[i];
                res3++;
            }
        }

        // creating an array for finding frequency
        int[] freq = new int[max + 1];

        // calculating the frequency of
        // all the elements present in
        // all the array
        for (int i = 0; i < res1; i++)
            freq[arr1[i]]++;
        for (int i = 0; i < res2; i++)
            freq[arr2[i]]++;
        for (int i = 0; i < res3; i++)
            freq[arr3[i]]++;

        // iterating till max and
        // whenever the frequency of element
        // will be three we print that element
        for (int i = 0; i <= max; i++)
            if (freq[i] == 3)
                System.out.print(i + " ");
        }
    }


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
        List<Integer> li2 = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            if(hm.containsKey(arr1[i]) == false){
                hm.put(arr1[i], 0);
            }
        }
        for(int i = 0; i < arr2.length; i++){
            if(hm.containsKey(arr2[i]) == false){
                hm.put(arr2[i], 0);
            }else if(hm.containsKey(arr2[i]) == true){
                hm.replace(arr2[i], 2);
            }
        }
        for(int i = 0; i < arr3.length; i++){
            if(hm.containsKey(arr3[i]) == false){
                hm.put(arr3[i], 0);
            }else if(hm.containsKey(arr3[i]) == true){
                hm.replace(arr3[i], 3);
            }
        }
        for(int i = 0; i < arr1.length; i++){
            int x = hm.get(arr1[i]);
            if(x == 3){
                li2.add(arr1[i]);
            }
        }
        System.out.println("The repeating numbers are: ");
        for(int i = 0; i < li2.size(); i++){
            System.out.print(li2.get(i)+" ");
        }
    }
}

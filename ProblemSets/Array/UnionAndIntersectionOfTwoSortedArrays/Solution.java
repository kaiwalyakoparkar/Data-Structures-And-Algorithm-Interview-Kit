package UnionAndIntersectionOfTwoSortedArrays;
import java.util.*;

public class Solution{
    public static void compareInsert(int a[], int b[], int n, int m){
        ArrayList<Integer> intersection = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();
        if(a.length > b.length){
            int visited[] = new int[m];
            for(int i = 0; i < b.length; i++){
                for(int j = 0; j < a.length; j++){
                    if(a[j] == b[i]){
                        visited[i] = 1;
                        break;
                    }
                }
            }
            for(int i = 0; i < visited.length; i++){
                if(visited[i] == 1){
                    intersection.add(b[i]);
                }
            }
            for(int i = 0; i < a.length ; i++){
                union.add(a[i]);
            }
            for(int i = 0; i < visited.length; i++){
                if(visited[i] == 0){
                    union.add(b[i]);
                }
            }

            System.out.println("Intersection through compare and insert is: "+intersection);
            System.out.println("Union through compare and insert is: "+union);

        }else if(b.length > a.length){
            int visited[] = new int[n];
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < b.length; j++){
                    if(a[i] == b[j]){
                        visited[i] = 1;
                        break;
                    }
                }
            }

            for(int i = 0; i < visited.length; i++){
                if(visited[i] == 1){
                    intersection.add(a[i]);
                }
            }
            for(int i = 0; i < b.length; i++){
                union.add(b[i]);
            }
            for(int i = 0; i < visited.length; i++){
                if(visited[i] == 0){
                    union.add(a[i]);
                }
            }

            System.out.println("Intersection through compare and insert is: "+intersection);
            System.out.println("Union through compare and insert is: "+union);

        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<b.length; i++){
            b[i] = sc.nextInt();
        }

        //This is a inbuilt library solution
        Set<Integer> a1 = new HashSet<>();
        Set<Integer> b1 = new HashSet<>();

       for(int i = 0; i < a.length; i++){
            a1.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            b1.add(b[i]);
        }


        if(a1.size() > b1.size()){
            if(a1.containsAll(b1) == true){
                System.out.println("Itersection of the set is: "+b1);
            }
        }else if(a1.size() < b1.size()){
             if(b1.containsAll(a1) == true){
                System.out.println("Itersection of the set is: "+a1);
            }
        }
        a1.addAll(b1);
        System.out.println("Union of the set is: "+a1);

        //This is compare and insert solution
        compareInsert(a,b,n,m);
    }
}

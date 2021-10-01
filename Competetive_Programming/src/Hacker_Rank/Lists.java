package Hacker_Rank;
import java.util.*;
public class Lists {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Integer> solution = new ArrayList();
        int number=sc.nextInt();

        for(int i=0; i<number-1; i++){
            int element = sc.nextInt();
            solution.set(i, element);
        }

        String Query1 = sc.nextLine();
        int index1 = sc.nextInt();
        int putElement = sc.nextInt();
        if(Query1=="Insert"||Query1=="insert"){
            solution.set(index1, putElement);
        }
        
        String Query2 = sc.nextLine();
        int index2 = sc.nextInt();
        if(Query2=="Delete"||Query2=="delete") {
        	solution.remove(index2);
        }
        System.out.println(solution);
        sc.close();
    }
}

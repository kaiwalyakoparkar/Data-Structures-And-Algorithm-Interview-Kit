package SpiralTraversalOfMatrix;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        ArrayList<Integer> list = new ArrayList<>();
        boolean [][] visited = new boolean[r][c];
        int x=0;
        int y=0;
        while(x<=r-1 && y<=c-1){
            for(int i=y;i<c;i++){
                if(visited[x][i]) break;
                list.add(matrix[x][i]);
                visited[x][i]=true;

            }
            x++;
            for(int i=x; i<r;i++){
                if(visited[i][c-1]) break;
                list.add(matrix[i][c-1]);
                visited[i][c-1]=true;
            }
            c--;
            for(int i=c-1;i>=y;i--){
                if(visited[r-1][i]) break;
                list.add(matrix[r-1][i]);
                visited[r-1][i] = true;
            }
            r--;
            for(int i=r-1;i>=x;i--){
                if(visited[i][y]) break;
                list.add(matrix[i][y]);
                visited[i][y]=true;
            }
            y++;
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
/*
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/

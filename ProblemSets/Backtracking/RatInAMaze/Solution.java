package RatInAMaze;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//It's a N X N matrix
        int mat[][] = new int[n][n];

        //Taking the input in matrix
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> li = ratInMaze(mat, n);

        //Printing the paths
        for(int i = 0; i < li.size(); i++){
            System.out.print(li.get(i)+" ");
        }
    }

    public static ArrayList<String> path = new ArrayList<>();
    public static int dx[] = {0,1,0,-1};
    public static int dy[] = {1,0,-1,0};
    public static String ca[] ={"R","D","L","U"};

    public static ArrayList<String> ratInMaze(int mat[][], int n){
        path.clear();

        if(mat[n-1][n-1]==0)
            return path;

        maze(mat,n,0,0,"");

        Collections.sort(path);
        return path;
    }

    public static void maze(int[][]mat,int n, int x, int y,String psf){
        if(x<0 || x>=n || y<0 || y>=n)
            return;

        if(mat[x][y] == 0)
            return;

        if(x==n-1 && y==n-1)
        {
            path.add(psf);
            return;
        }

        mat[x][y] =0;

        for(int i=0;i<4;i++){
           int a = x + dx[i];
           int b = y + dy[i];

           maze(mat,n,a,b,psf+ca[i]);
       }
        mat[x][y] = 1;
    }
}
/*
4
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1
*/

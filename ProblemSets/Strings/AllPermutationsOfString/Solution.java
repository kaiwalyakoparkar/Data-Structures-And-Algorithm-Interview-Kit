package AllPermutationsOfString;
import java.util.*;

public class Solution{

    //Actual function which generates permutation
    public static void generartePermutation(int cs, int ts, HashMap<Character,Integer> fmap, String asf) {
        if(cs > ts){
            System.out.println(asf);
            return;
        }

        for(char ch : fmap.keySet()){
            if(fmap.get(ch)>0){
                fmap.put(ch, fmap.get(ch)-1);
                generartePermutation(cs+1, ts, fmap, asf+ch);
                fmap.put(ch, fmap.get(ch)+1);
            }
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //Mapping technique
        HashMap<Character,Integer> fmap = new HashMap<>();
        for(char ch: str.toCharArray()){
            if(fmap.containsKey(ch)){
                fmap.put(ch, fmap.get(ch)+1);
            }else{
                fmap.put(ch,1);
            }
        }

        generartePermutation(1, str.length(), fmap, "");
    }
}
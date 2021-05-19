package LongestSubstringWithUniqueCharacters;
import java.util.*;

public class Solution{
    /*
    @param - s- Takes in string with characters and without any special character in between
    @returm - max - returns the maximum length of substring with unique characters
    */
    public static int findTheMaxLength(String s){
        if(s.length()==0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        if(s.length()==2){
            int a = 0, b = 1;
            if(s.charAt(a) == s.charAt(b)){
                return 1;
            }else{
                return 2;
            }
        }

        int max = 1;
        for(int i = 0; i < s.length()-2; i++){
            List<Character> li = new ArrayList<>();
            for(int j = i+2; i < s.length(); j++){
                for(int k = i; k <= j; k++){
                    if(!li.contains(s.charAt(k))){
                        li.add(s.charAt(k));
                    }else{
                        break;
                    }
                }
                if(li.size() > max){
                    max = li.size();
                }
                break;
            }
        }
        return max;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //Declaring the string
        String s = sc.next();

        //Computing and printing
        int max = findTheMaxLength(s);
        System.out.println("The length of the longest substring is : "+max);
    }
}

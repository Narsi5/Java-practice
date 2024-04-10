import java.util.HashSet;

public class Recursion_uniquesubsequences {
    public static void uniquesubsequences(String str, int index, String newString,HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currChar = str.charAt(index);

        //to be
        uniquesubsequences(str,index+1,newString+currChar,set);
        //not to be
        uniquesubsequences(str,index+1,newString,set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniquesubsequences(str,0,"",set);
    }
}

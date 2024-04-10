public class Recursion_permutations {
    //timecomplexity : O(n*n!)
    //n-> no of steps to reach ans || n!->total no of ans
    public static void printperm(String str,String permutations,int index){
        if(str.length() == 0){
            System.out.println(permutations);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            printperm(newStr,permutations+currChar,index+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printperm(str,"",0);
    }
}

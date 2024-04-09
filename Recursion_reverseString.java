public class Recursion_reverseString {
    public static void printreverse(String str,int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printreverse(str,index-1);

    }
    public static void main(String[] args) {
        String str = "abcd";
        printreverse(str,str.length()-1);

    }
}

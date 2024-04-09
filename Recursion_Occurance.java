public class Recursion_Occurance {
    public static int first =-1;
    public static int last = -1;
    public static void findocc(String str,int index,char elm){
        if(index == str.length()){
            System.out.println("The First occurance is at index " + first);
            System.out.println("The Last occurance is at index " + last);
            return;
        }
        char currChar =str.charAt(index);
        if(currChar == elm){
            if(first == -1){
                first =index;
            }
            else {
                last = index;
            }
        }
        findocc(str,index+1,elm);
    }
    public static void main(String[] args) {
        String str = "aabcdeeagblja";
        findocc(str,0,'a');
    }
}

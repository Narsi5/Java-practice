public class Recursion_NoOfwaystocallguests {
    public static int guestcall(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int single = guestcall(n-1);
        int pair = (n-1)*guestcall(n-2);
        return single +pair;

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(guestcall(n));
    }
}

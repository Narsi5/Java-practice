import java.util.Scanner;

public class Recursion_TowerofHanoi {
    // A -Source B -Spare C - Destination
    static int step=0;
    public static void ToH(int n,char A,char B,char C){
        if(n == 1){
            System.out.println("Step:"+(++step) +" Move"+A+"to"+C);
            return ;
        }

        ToH(n-1,A,C,B);
        ToH(1,A,B,C);
        ToH(n-1,B,A,C);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rings");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ToH(n,'A','B','C');

    }
}

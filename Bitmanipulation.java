import java.util.Scanner;

public class Bitmanipulation {
    public static void main(String[] args) {
        //get bit(to retrive or know the number at the given postion using bit mask)
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        if((bitmask&n)==0 ){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }

        //set bit (we set a particular postion to 1)
        int nn = bitmask|n;
        System.out.println(nn);

        //clear bit (we set a particular postion to 0)
        int cn = ~(bitmask)&n;
        System.out.println(cn);

        //update bit (we update the pos acc to our needs if 0 then 1 viceversa
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt() ;// if = 1 set to  1 else to 0
        if(operation == 1){
            int newNumber = bitmask |n;
            System.out.println(newNumber);
        }else{
            int newNumber = ~(bitmask)&n;
            System.out.println(newNumber);
        }



    }
}

public class SecondChallenge {
    public static void main(String[] args) {

    }
    public static String getDurationString(int seconds){

        int minutes = seconds/60;
        int hours = minutes/60;
        System.out.println("hours=" + hours);

        int reaminingMinutes = minutes%60;
        System.out.println("minutes =" + minutes);
        System.out.println("remainingminutes ="+ reaminingMinutes);

        int remainingSeconds = seconds%60;
        System.out.println("remainingSecond ="+ remainingSeconds);


        return hours + "h"+ reaminingMinutes+"m"+reaminingMinutes+"s";
    }
    public static String getDurationString(int minutes,int seconds){

        return "";

    }
}

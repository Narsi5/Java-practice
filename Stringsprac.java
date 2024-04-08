public class Stringsprac {
    public static void main(String[] args) {
        //concatenation
        String firstname ="tony";
        String second = "stark";
        String fullName = firstname+second;
        System.out.println(fullName);
        //charAt
        for(int i =0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        //compare
        //s1>s2 : +ve value
        //s2<s1 : -ve value
        //s1 = s2 : 0
        String name1 = "narsi";
        String name2 = "narsi";
        if(name1.compareTo(name2)==0){
            System.out.println("string are equal");

        }
        else{
            System.out.println("strings are not equal");
        }
        //substring

        String sentance = "hi my name is tony";
        String name = sentance.substring(5,sentance.length()-2);
        System.out.println(name);
        //string builders
        StringBuilder sd = new StringBuilder("Tony");
        System.out.println(sd.charAt(1));
        sd.delete(2,3);
        System.out.println(sd);
    }
}

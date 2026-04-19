public class EndOtherExample {
    public static void main(String[] args){

        String str1 = "Hiabc";
        String str2 = "abc";

        if (str1.endsWith(str2) || str2.endsWith(str1)) {
             System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}

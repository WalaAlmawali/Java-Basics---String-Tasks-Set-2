public class MergeStringExample {
    public static void main(String[] args) {

        String str1 = "Hi";
        String str2 = "There";


        String result = "";
        String reultIfStringNotEquals = "";


            for (int i = 0; i < str1.length(); i++) {
                char ch1 = str1.charAt(i);
                result += ch1;

                for (int j = 0; j < str2.length(); j++) {
                    char ch2 = str2.charAt(i);
                    result += ch2;

                    break;
                }


            }

            if(str1.length() == str2.length()) {
                System.out.println(result);
            } else if(str1.length() < str2.length()) {

                for(int i = str1.length();i<str2.length();i++ ){
                    reultIfStringNotEquals+=str2.charAt(i);
                }

                System.out.println(result.concat(reultIfStringNotEquals));

            }
    }
}

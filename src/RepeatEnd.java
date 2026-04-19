public class RepeatEnd {
    public static void main(String[] args){


        System.out.println(repeatEnd("Hello",3));

    }

    public static String repeatEnd(String str, int n){
        String result ="";

        String repetPattern = str.substring(str.length()-n,str.length());
        for(int i= 0; i< n;i++){
            result+=repetPattern;
        }

        return result;
    }

}

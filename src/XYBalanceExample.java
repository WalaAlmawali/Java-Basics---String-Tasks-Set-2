public class XYBalanceExample {
    public static void main(String[] args) {

        System.out.println(xyBalance("aaxbb"));


    }

    public static boolean xyBalance(String str) {

        if(str.contains("x")){
            int IndexOfX = str.indexOf("x");

            for(int i = IndexOfX +1;i<str.length();i++ ){
                if(str.charAt(i) == 'y'){
                    return true;
                }
            }
        }

        return false;
    }

    }

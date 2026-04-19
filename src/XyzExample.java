public class XyzExample {
    public static void main(String[] args){

        System.out.println(xyzThere("abc.xyz"));

    }

    public static boolean xyzThere(String str) {
        if(str.contains("xyz")){
            int startIndexOfXyz = str.indexOf("xyz");
              if(str.charAt(startIndexOfXyz -1) != '.'){
                  return true;
              }
        }

        return false;

    }
}

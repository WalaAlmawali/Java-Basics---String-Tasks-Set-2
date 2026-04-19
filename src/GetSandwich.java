public class GetSandwich {
    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread"));

    }

    public static String getSandwich(String str) {

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        return str.substring(first + 5, last);
      }

    }

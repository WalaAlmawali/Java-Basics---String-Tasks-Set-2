public class oneTwo {
    public static void main(String[] args) {


        System.out.println(oneTwo("tca"));


    }

    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i + 2 < str.length(); i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    }

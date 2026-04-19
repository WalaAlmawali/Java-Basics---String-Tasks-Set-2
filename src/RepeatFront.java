public class RepeatFront {
    public static void main(String[] args) {


        System.out.println((repeatFront("Zelda", 3)));

    }

    public static String repeatFront(String str, int num) {
        StringBuilder result = new StringBuilder();

        for (int i = num; i >= 1; i--) {
            result.append(str.substring(0, i));
        }

        return result.toString();
    }
}

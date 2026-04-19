import java.util.*;

public class CountcoExample {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = sc.nextLine();
        int code= 0;

        for (int i = 0; i < text.length() -3; i++) {

            if ((text.substring(i, i + 2).equals("co")) &&( text.charAt(i+3)=='e' )) {
                code++;

            }

        }

        System.out.print(code);

    }

    }

import java.util.*;

public class StringCountHi {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = sc.nextLine();

        int hiCount = 0;

        for (int i = 0; i < text.length() -1; i++) {
            if (text.substring(i, i + 2).equals("hi")) {
                hiCount++;
            }
        }
        System.out.print("the total number of 'hi' is :" + hiCount);

    }

    }

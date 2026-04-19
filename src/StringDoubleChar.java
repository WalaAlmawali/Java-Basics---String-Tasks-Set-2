import java.util.*;
public class StringDoubleChar {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result = result + ch + ch;
        }
        System.out.print(result);


    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String text = "I am learning Java";
        text.split("-");
        List<String> str = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            str.add(String.valueOf(ch));
        }
        System.out.println(str);

    }
}
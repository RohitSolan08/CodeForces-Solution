import java.util.Arrays;
import java.util.Scanner;

public class AntonAndLetters {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String yara = in.nextLine();
        yara = yara.replace(" ", "");
        yara = yara.replace("}", "");
        yara = yara.replace("{", "");
        yara = yara.replace(",", "");
        int no = 1;
        char[] letters = yara.toCharArray();
        Arrays.sort(letters);
        if(letters.length==0)
        {
            System.out.println("0");
            return;
        }
        char comp = letters[0];
        for (int i = 1; i < letters.length; i++) {
            String b = Character.toString(comp);
            String c = Character.toString(letters[i]);
                        if (b.compareTo(c) == 0)
                continue;
            else {

                comp = letters[i];

                no++;

            }
        }

        System.out.println(no);
    }

}

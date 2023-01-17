import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean b = true;

        while (Integer.parseInt(s) != 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                    b = false;
                    break;
                }
            }
            if(b) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

            b = true;
            s = br.readLine();
        }
    }
}
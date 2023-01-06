import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        if (m >= 45) {
            System.out.println(h + " " + (m - 45));
        }
        else {
            if (h == 0){
                System.out.println(23 + " " + (60 - (45 - m)));
            }
            else 
                System.out.println((h - 1) + " " + (60 - (45 - m)));
        }
    }
}

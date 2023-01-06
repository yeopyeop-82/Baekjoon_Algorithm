import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int ascending = 0;
        int descending = 0;

        for (int i = 0; i < 7; i++) {
            if (Integer.parseInt(str[i]) < Integer.parseInt(str[i + 1])) {
                ascending++;
            }
            else {
                descending++;
            }
        }

        if (ascending == 7)
            System.out.println("ascending");
        else if (descending == 7)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}

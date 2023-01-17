import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int count_mod = 0;

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= temp; j++) {
                if (temp % j == 0) {
                    count_mod++;
                }
            }
            if (count_mod == 2) {
                count++;
                count_mod = 0;
            }
            count_mod = 0;
        }

        System.out.println(count);
    }
}
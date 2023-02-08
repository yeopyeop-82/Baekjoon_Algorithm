import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int nf = 1;
        int kf = 1;
        int nkf = 1;

        for (int i = 1; i <= n; i++) {
            nf *= i;
        }

        for (int i = 1; i <= k; i++) {
            kf *= i;
        }

        for (int i = 1; i <= (n - k); i++) {
            nkf *= i;
        }

        System.out.println(nf / (kf * nkf));
    }
}
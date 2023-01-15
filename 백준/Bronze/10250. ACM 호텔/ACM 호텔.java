import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int h, n;
        for (int i = 0; i < tc; i++) {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine(), " ");
            h = Integer.parseInt(st.nextToken());
            st.nextToken();
            n = Integer.parseInt(st.nextToken());

            if ((n % h) == 0) {
                sb.append(h);
                if (((n / h)) < 10) {
                    sb.append("0");
                    sb.append((n / h));
                }
                else {
                    sb.append((n / h));
                }
            }
            else {
                sb.append((n % h));
                if (((n / h) + 1) < 10) {
                    sb.append("0");
                    sb.append((n / h) + 1);
                }
                else {
                    sb.append((n / h) + 1);
                }
            }

            System.out.println(sb);
        }
    }
}

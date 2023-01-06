import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class baekjoon_10871 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tc = br.readLine().split(" ");
        int x = Integer.parseInt(tc[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            if (x > temp) {
                System.out.print(temp + " ");
            }
        }
    }
}

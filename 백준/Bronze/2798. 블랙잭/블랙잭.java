import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int temp = 0;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[tc];

        for (int i = 0; i < tc; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < tc; i++) {
            for (int j = i + 1; j < tc; j++) {
                for (int k = j + 1; k < tc; k++) {
                    temp = (arr[i] + arr[j] + arr[k]);
                    if (temp <= n) {
                        if ((n - temp) < (n - sum)) {
                            sum = temp;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
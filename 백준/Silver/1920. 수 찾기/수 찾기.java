import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            int findIndex = Arrays.binarySearch(A, Integer.parseInt(st.nextToken()));
            if (findIndex >= 0) {
                sb.append("1").append("\n");
            }
            else {
                sb.append("0").append("\n");
            }
        }
        
        System.out.println(sb);
    }
}

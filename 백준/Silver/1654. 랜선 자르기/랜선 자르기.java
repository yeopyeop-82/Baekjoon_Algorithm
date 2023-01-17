import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long result = 0;
        long result_length = 0;
        long max = 0;
        long min = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        while (min < max) {
            result = 0;
            result_length = (max + min) / 2;
            for (int j = 0; j < k; j++) {
                result += (arr[j] / result_length);
            }

            if(result < n) {
                max = result_length;
            }
            else {
                min = result_length + 1;
            }
        }

        bw.write(Long.toString(min - 1));
        bw.close();
    }
}

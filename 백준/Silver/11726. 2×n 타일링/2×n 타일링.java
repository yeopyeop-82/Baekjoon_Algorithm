import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] square = new int[1001];

        square[1] = 1;
        square[2] = 2;

        for (int i = 3; i <= n; i++) {
            square[i] = (square[i - 1] + square[i - 2]) % 10007;
        }

        System.out.println(square[n]);
    }
}
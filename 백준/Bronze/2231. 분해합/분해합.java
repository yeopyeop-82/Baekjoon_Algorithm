import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        boolean isEnd = false;

        for (int i = 0; i < n; i++) {
            String temp = Integer.toString(i);
            sum = i;
            for (int j = 0; j < temp.length(); j++) {
                sum += ((int)temp.charAt(j) - 48);
            }
            if (sum == n) {
                System.out.println(i);
                isEnd = true;
                break;
            }
        }

        if (isEnd == false) {
            System.out.println(0);
        }
    }
}
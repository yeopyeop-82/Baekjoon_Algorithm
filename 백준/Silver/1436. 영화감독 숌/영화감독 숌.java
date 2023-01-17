import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int n666 = 0;

        while (count != n) {
            n666++;
            if (Integer.toString(n666).contains("666")) {
                count++;
            }
        }

        System.out.println(n666);
    }
}
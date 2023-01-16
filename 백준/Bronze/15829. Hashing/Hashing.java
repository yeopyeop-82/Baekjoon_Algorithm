import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String s = br.readLine();
        long sum = 0;

        for (int i = 0; i < tc; i++) {
            long temp = (s.charAt(i) - 'a') + 1;
            temp = (long)(temp * Math.pow(31, i));
            sum += temp;
        }

        System.out.println(sum % 1234567891);
    }    
}
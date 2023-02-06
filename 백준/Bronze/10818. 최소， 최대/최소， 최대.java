import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        

        String[] str = br.readLine().split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        
        for (int i = 0; i < tc; i ++) {
            int temp = Integer.parseInt(str[i]);
            if (temp >= max) {
                max = temp;
            }
            if (temp <= min) {
                min = temp;
            }
        }

        System.out.println(min + " " + max);
    }
}

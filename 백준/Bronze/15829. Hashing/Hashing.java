import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        
        int[] arr = new int[tc];
        for (int i = 0; i < tc; i++) {
            arr[i] = (s.charAt(i) - 'a') + 1;
            if (arr[i] * Math.pow(41, i) > 1234567891) {
                arr[i] = (int)(arr[i] * Math.pow(31, i)) % 1234567891;
            }
            else {
                arr[i] = (int)(arr[i] * Math.pow(31, i));
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }    
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon_10809 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        for (int i = 0 ; i < 26; i++) {
            arr[i] = -1;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (int j = 0; j < s.length(); j++) {
            if(arr[(s.charAt(j) - 'a')] == -1)  
                arr[(s.charAt(j) - 'a')] += (j + 1);
        }

        for (int k = 0; k < 26; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

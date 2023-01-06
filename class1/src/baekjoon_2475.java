import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class baekjoon_2475 {
    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int sum = 0;
        int temp = 0;

        while(st.hasMoreTokens()) {
            temp = (Integer.parseInt(st.nextToken()));
            sum += (temp * temp);
        }

        System.out.println(sum % 10);
    }
}
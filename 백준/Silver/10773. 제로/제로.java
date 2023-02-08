import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stck = new Stack<Integer>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) stck.pop();
            else stck.push(temp);
        }

        while(stck.empty() != true) {
            sum += stck.pop();
        }

        System.out.println(sum);
    }
}
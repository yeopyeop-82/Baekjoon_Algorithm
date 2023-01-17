import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] arr = new int[tc + 1];
        int count = 1;
        Stack<Integer> intStack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= tc ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= tc; i++) {
            intStack.push(i);
            sb.append("+").append("\n");
            while(!intStack.empty() && intStack.peek() == arr[count]) {
                intStack.pop();
                sb.append("-").append("\n");
                count++;
            }
        }

        if (intStack.empty()) {
            System.out.println(sb);
        }
        else {
            System.out.println("NO");
        }
        
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int noCount = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tc; i++) {
            Stack<Character> charStack = new Stack<>();
            String s = br.readLine();
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == ')') {
                    charStack.push(s.charAt(j));
                }
                else if (s.charAt(j) == '(') {
                    if (charStack.empty()) {
                        System.out.println("NO");
                        noCount++;
                        break;
                    }
                    else {
                        if (charStack.peek() == ')') {
                            charStack.pop();
                        }
                    }
                }
            }

            if (noCount == 0 && charStack.empty()) {
                System.out.println("YES");
            }

            if (!charStack.empty()) {
                System.out.println("NO");
            }

            System.out.print(sb);
            noCount = 0;

        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int score = 1;
        int sum = 0;

        for (int i = 0; i < tc; i++) {
            String s = br.readLine();
            score = 1;
            sum = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    if ((j + 1) < s.length()) {
                        if (s.charAt(j + 1) != 'O'){
                            sum += score;
                            score = 1;
                        }
                        else {
                            sum += score;
                            score++;
                        }
                    }
                    else {
                        sum += score;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baekjoon_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        StringBuffer sb1 = new StringBuffer();
        sb1.append(str[0]);
        sb1.reverse();

        StringBuffer sb2 = new StringBuffer(str[1]);
        sb2.reverse();

        String s1 = sb1.toString();
        String s2 = sb2.toString();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if (n1 > n2) {
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }
    }
}

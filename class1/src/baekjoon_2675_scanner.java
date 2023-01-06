import java.util.*;

public class baekjoon_2675_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i ++) {

            int count2 = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for(int k = 0; k < count2; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

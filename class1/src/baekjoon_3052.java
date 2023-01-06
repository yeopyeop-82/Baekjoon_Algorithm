import java.util.*;

public class baekjoon_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int temp = 0;

        for (int i = 0; i < 10; i++) {
            temp = sc.nextInt() % 42;
            if (v.contains(temp)){
                continue;
            }
            v.add(temp);
        }

        System.out.println(v.size());
        sc.close();
    }
}

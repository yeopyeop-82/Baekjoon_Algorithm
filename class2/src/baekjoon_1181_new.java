import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class baekjoon_1181_new {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        String[] arr = new String[tc];

        for (int i = 0; i < tc; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String arg0, String arg1) {
                if(arg0.length() < arg1.length()) {
                    return -1;
                }
                else if (arg0.length() == arg1.length()) {
                    return arg0.compareTo(arg1);
                }
                else {
                    return 1;
                }
            }
        });

        for (int j = 0; j < tc; j++) {
            if (j + 1 < tc) {
                if (arr[j].equals(arr[j + 1])) {
                    continue;
                }
            }
            System.out.println(arr[j]);
            
        }

    }
}
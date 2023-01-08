import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class baekjoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vector<String> v = new Vector<String>();

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String temp = br.readLine();
            if (!v.contains(temp)) {
                v.add(temp);
            }
        }

        Collections.sort(v, new Comparator<String>() {
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

        Iterator<String> it = v.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

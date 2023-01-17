import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(bf.readLine());
            int originalSum = 0;
            int max = 0;
            int temp = 0;
            double originalMean = 0;
            double newMean = 0;

            StringTokenizer st = new StringTokenizer(bf.readLine());

            for (int i = 0; i < count; i++) {
                temp = Integer.parseInt(st.nextToken());
                if (temp >= max) {
                    max = temp;
                }
                originalSum += temp;
            }

            originalMean = (double)originalSum / count;
            newMean = (originalMean / max) * 100;

            System.out.println(newMean);

        }
}
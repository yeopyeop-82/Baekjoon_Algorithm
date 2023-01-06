import java.util.Scanner;

public class baekjoon_2577 {
    public static void main(String[] args) {
        int result = 1;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            result *= s.nextInt();
        }
        s.close();

        String stringResult = Integer.toString(result);
        int[] resultArr = new int[10];

        for (int j = 0; j < stringResult.length(); j++) {
            switch (stringResult.charAt(j)) {
                case '0':
                resultArr[0] += 1;
                break;

                case '1':
                resultArr[1] += 1;
                break;

                case '2':
                resultArr[2] += 1;
                break;

                case '3':
                resultArr[3] += 1;
                break;

                case '4':
                resultArr[4] += 1;
                break;

                case '5':
                resultArr[5] += 1;
                break;

                case '6':
                resultArr[6] += 1;
                break;

                case '7':
                resultArr[7] += 1;
                break;

                case '8':
                resultArr[8] += 1;
                break;

                case '9':
                resultArr[9] += 1;
                break;
            }
        }
        
        for (int k = 0; k < 10; k++) {
            System.out.println(resultArr[k]);
        }
    }
}

public class practice {
    public static void main(String[] args) {
        int[] arr = {802, 743, 457, 549};
        int result = 0;

        for (int j = 0; j < 4; j++) {
            result += (arr[j] / 185);
        }

        System.out.println(result);

    }
}

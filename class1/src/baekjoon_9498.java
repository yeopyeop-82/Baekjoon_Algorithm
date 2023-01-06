import java.util.Scanner;

public class baekjoon_9498 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        score /= 10;

        switch(score) {
            case 10:
            case 9:
            System.out.println("A");
            break;

            case 8:
            System.out.println("B");
            break;

            case 7:
            System.out.println("C");
            break;

            case 6:
            System.out.println("D");
            break;

            default:
            System.out.println("F");
            break;

        }
        s.close();
    }
}

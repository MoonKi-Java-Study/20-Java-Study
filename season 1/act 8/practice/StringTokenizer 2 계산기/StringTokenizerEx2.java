import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        String formula = scanner.next();
        StringTokenizer stringTokenizer = new StringTokenizer(formula, "+");

        while (stringTokenizer.hasMoreTokens()) {
            sum += Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.println(sum);
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        boolean isPositive;

        String formula = scanner.next();
        StringTokenizer stringTokenizer = new StringTokenizer(formula, "-+", true);

        if (stringTokenizer.countTokens() % 2 == 1) {
            result+= Integer.parseInt(stringTokenizer.nextToken());
            while (stringTokenizer.hasMoreTokens()) {
                if (stringTokenizer.nextToken().equals("+")) {
                    isPositive = true;
                } else {
                    isPositive = false;
                }
                if (isPositive) {
                    result += Integer.parseInt(stringTokenizer.nextToken());
                } else {
                    result -= Integer.parseInt(stringTokenizer.nextToken());
                }
            }
        } else {
            while (stringTokenizer.hasMoreTokens()) {
                if (stringTokenizer.nextToken().equals("+")) {
                    isPositive = true;
                } else {
                    isPositive = false;
                }
                if (isPositive ) {
                    result += Integer.parseInt(stringTokenizer.nextToken());
                } else {
                    result -= Integer.parseInt(stringTokenizer.nextToken());
                }
            }
        }

        System.out.println(result);
    }
}

package errorcatcher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorCatcher {
    public int getInteger() {
        Scanner scanner = new Scanner(System.in);

        int a = -1;
        while (a == -1) {
            try {
                a = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                scanner.next();// throwout token in input stream that isn't int data type
                continue;
            }
        }

        scanner.close();
        return a;
    }
}

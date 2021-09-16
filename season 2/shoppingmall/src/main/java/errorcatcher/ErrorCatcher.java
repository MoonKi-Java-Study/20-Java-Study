package errorcatcher;

import shoppingmall.MainMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorCatcher {
    public int getInteger() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int a = scanner.nextInt();
                if (a == -1) {
                    new MainMenu();
                }
                return a;
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                scanner.next();// throwout token in input stream that isn't int data type
                continue;
            }
        }
    }
}

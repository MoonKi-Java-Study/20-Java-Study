import java.util.Scanner;

class Add extends CalC {
    public int calculate() {
        return a + b;
    }
}

class Sub extends CalC {
    public int calculate() {
        return a - b;
    }
}

class Mul extends CalC {
    public int calculate() {
        return a * b;
    }
}

class Div extends CalC {
    public int calculate() {
        return a / b;
    }
}

public class CalC {
    public int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two integer and a operator>> ");

            CalC add = new Add();
            CalC sub = new Sub();
            CalC mul = new Mul();
            CalC div = new Div();

            int result;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String operator = scanner.next();

            if (operator.equals("+")) {
                add.setValue(a, b);
                result = add.calculate();
                System.out.println(result);
            }

            if (operator.equals("-")) {
                sub.setValue(a, b);
                result = sub.calculate();
                System.out.println(result);
            }

            if (operator.equals("*")) {
                mul.setValue(a, b);
                result = mul.calculate();
                System.out.println(result);
            }

            if (operator.equals("/")) {
                div.setValue(a, b);
                result = div.calculate();
                System.out.println(result);
            }

            if (operator.equals("@")) {
                break;
            }
        }

    }
}
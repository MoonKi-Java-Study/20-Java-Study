import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("what r u looking for: ");
            String eng = scanner.next();
            if (eng.equals("exit")) {
                System.out.println("turn off the program");
                break;
            }

            String kor = dic.get(eng);
            if (kor == null) {
                System.out.println("there is no " + eng);
            } else {
                System.out.println(kor);
            }
        }
    }
}

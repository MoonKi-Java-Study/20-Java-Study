import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();

        map.put("hwang", new Student(1, "010-111-1111"));
        map.put("lee", new Student(2, "010-222-2222"));
        map.put("kim", new Student(3, "010-333-3333"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("name to search : ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                break;
            }

            Student student = map.get(name);// searching for Student Obj who has same name
            if (student == null) {
                System.out.println("there is no " + name);
            } else {
                System.out.println("id: " + student.getId() +
                        "Tel: " + student.getTel());
            }
        }
    }
}

class Student {
    int id;
    String tel;

    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }
}

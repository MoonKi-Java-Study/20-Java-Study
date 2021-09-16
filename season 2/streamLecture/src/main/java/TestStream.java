import java.util.ArrayList;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        /*List<People> peopleList = new ArrayList<>();
        peopleList = People.getPeopleList();

        peopleList.stream()
                .filter(people -> people.getGender() == 2)
                .forEach(System.out::println);*/

        List<People> peopleList = new ArrayList<>();
        peopleList = People.getPeopleList();

        People people;//temp

        for (int i = 0; i < peopleList.size(); i++) {
            people = peopleList.get(i);
            if (people.getGender() == 2) {
                System.out.println(people.getName() + "   " +
                         people.getAge() + "    " +
                         people.getGender());
            }
        }
    }
}

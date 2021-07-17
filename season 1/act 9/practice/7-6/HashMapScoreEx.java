import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
    public static void main(String[] args) {
        HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

        javaScore.put("pobi", 97);
        javaScore.put("woni", 88);
        javaScore.put("jun", 98);
        javaScore.put("wig", 70);
        javaScore.put("yun", 99);

        System.out.println("number of HashMap's element: " + javaScore.size());


        Set<String> keys = javaScore.keySet();

        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            int score = javaScore.get(name);
            System.out.println(name + " : " + score);
        }
    }
}

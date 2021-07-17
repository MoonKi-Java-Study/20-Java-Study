import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String separateByComma = "냉장고,세탁기,에어컨,TV,오디오";
        StringTokenizer stringTokenizer = new StringTokenizer(separateByComma, ",");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.print(stringTokenizer.nextToken() + " ");
        }
    }
}
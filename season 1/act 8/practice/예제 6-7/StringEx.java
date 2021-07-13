public class StringEx {
    public static void main(String[] args) {
        String a = new String(" c#");
        String b = new String(", C++");

        System.out.println(a + "'s length is " + a.length());
        System.out.println(a.contains("#"));

        a = a.concat(b);// 문자열 연결
        System.out.println(a);

        a = a.trim();// 문자열 열뒤 공백 제거
        System.out.println(a);

        a = a.replace("C#", "Java");
        System.out.println(a);

        String s[] = a.split(",");
        for (int i = 0; i < s.length; i++) {
            System.out.println("splitted string " + i + ": " + s[i]);
        }

        a = a.substring(5);// 인덱스 5부터 끝까지 서브 스트링 리턴
        System.out.println(a);

        char c = a.charAt(2);// 인덱스 2의 문자 리턴
        System.out.println(c);
    }
}

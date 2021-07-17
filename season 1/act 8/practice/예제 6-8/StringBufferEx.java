public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil");
        System.out.println(sb);

        sb.insert(7, " my");
        System.out.println(sb);

        sb.replace(8, 10, "your");
        System.out.println(sb);

        sb.delete(8, 13);//delete "your"
        System.out.println(sb);

        sb.setLength(4);// 스트링 버퍼 내 문자열 길이 수정
        System.out.println(sb);//sb.toString()으로 자동 바뀜
    }
}

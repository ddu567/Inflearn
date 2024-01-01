package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127;
        short s = 32767;
        int i = 2147483647; // -2147483648 ~ 2,147,483,658 (약 20억)
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // 권장x
        double d = 10.0; // 기본
        // double이 float보다 정밀도가 높음

        // 실무에서 거의 사용하지 않는 변수 타입
        // byte(파일 전송, 복사 등에 주로 사용), short, float, char(주로 String) 사용

        // 자주 사용하는 타입
        // int, long / double, boolean, String
    }
}

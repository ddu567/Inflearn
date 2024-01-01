package cond;

public class ConOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? " 성인":"미성년자";
        System.out.println("age = " + age + " status = " + status);
    }

    // 삼항 연산자
    // (조건) ? 참_표현식 : 거짓_표현식;
}

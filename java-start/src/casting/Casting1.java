package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longVAlue;
        double doubleValue;

        longVAlue = (long) intValue; // int -> long
        System.out.println("LongValue = " + longVAlue);

        doubleValue = (double) intValue; // int -> doubleValue
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}

package front;

import java.math.BigInteger;

public class fTest {
    public static void main(String[] args) {
        System.out.println(f(19));

    }   //  method main end.

    public static BigInteger  f(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        } else {
            return f(n - 1).multiply(BigInteger.valueOf(n));
        }
    }   //  method end.

}   // class end.

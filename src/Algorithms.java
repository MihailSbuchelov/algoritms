import java.math.BigInteger;

public class Algorithms {
    static int i=1;

    public static void main(String[] args) {
        fib(BigInteger.valueOf(7));
    }

    public static BigInteger fib(BigInteger n) {

        if (n.equals(BigInteger.ONE) || n.equals(BigInteger.TWO)) {
            System.out.println(n);
            System.out.println("count="+i);
            i=i+1;
            return n;
        }
        System.out.println(fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)))+"count="+i);
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
    }
}
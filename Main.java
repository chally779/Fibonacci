import java.math.BigInteger;

class Fibonacci {                          // no 'public'
    public static void main(String[] args) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First 100 Fibonacci Numbers:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(first + " ");
            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
    }
}
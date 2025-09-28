public class pr1n5 {
    static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Факториал 10 - " + fact(10));
        System.out.println("Факториал 9 - " + fact(9));
        System.out.println("Факториал 5 - " + fact(5));
    }
}

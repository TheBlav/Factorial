public class Factorial {
    public static void main(String[] args) {
        int result = factorial(15);
        System.out.println(result);
    }

    private static int factorial(int n){
        if (n>1)
            return n*factorial(n-1);
        else return 1;
    }
}

public class Problema3 {
    public static void main(String[] args) {
        long i = 2;
        long num = 600851475143L;

        while(i * i < num) {
            while(num % i == 0) {
                num = num / i;
            }
            i++;
        }

        System.out.println("Problema 3 - Maior fator primo do número 600851475143");
        System.out.println();
        System.out.println("Resultado: " + num);
    }
}

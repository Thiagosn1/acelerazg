public class Problema2 {
    public static void main(String[] args) {
        int soma = 0;
        int num1 = 1;
        int num2 = 2;

        while (num2 < 4000000) {
            soma = soma + num2;
            int num = num2;
            num2 = num2 + 2 * (num2 + num1);
            num1 = num1 + (2 * num);
        }

        System.out.println("Problema 2 - Soma dos valores pares da sequência de fibonacci menores que 4000000");
        System.out.println();
        System.out.println("Resultado: " + soma);
    }
}

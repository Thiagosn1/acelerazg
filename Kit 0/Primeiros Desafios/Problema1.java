public class Problema1 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma = soma + i;
            }
        }

        System.out.println("Problema 1 - Soma dos múltiplos de 3 ou 5 abaixo de 10000");
        System.out.println();
        System.out.println("Resultado: " + soma);
    }
}

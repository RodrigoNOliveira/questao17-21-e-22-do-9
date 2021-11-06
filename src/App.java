import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] entrada = new int[5];
        int media = 0;
        int soma = 0;

        System.out.println("Digite 5 valores inteiros: ");
        for (int i = 0; i < entrada.length; i++) {
            entrada[i] = scanner.nextInt();

        }

        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < entrada.length; i++) {
            soma = soma + entrada[i];
            System.out.println(entrada[i] + " ");
        }
        media = soma / entrada.length;
        System.out.println();
        System.out.println("A medía dos valores é de: " + media);


        scanner.close();
    }
}
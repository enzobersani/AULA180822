import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xD = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int numeroEscolhido = xD.nextInt();
        System.out.println("O fatorial de " + numeroEscolhido + " é: " +  fatorialNum(numeroEscolhido));

    }


    private static double fatorialNum(double numeroEscolhido) {
        if (numeroEscolhido <= 0) {
            return 0;
        } else if (numeroEscolhido > 1) {
            return fatorialNum(numeroEscolhido - 1) * numeroEscolhido;
        }else {
            return 1;
        }
    }
}
import java.util.Scanner;
public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taxas de câmbio fixas (valores fictícios, podem ser atualizados)
        final double DOLAR = 5.10;
        final double EURO = 5.45;
        final double LIBRA = 6.20;

        int opcao;
        do {
            System.out.println("\n=== CONVERSOR DE MOEDAS ===");
            System.out.println("1. Converter para Dólar (USD)");
            System.out.println("2. Converter para Euro (EUR)");
            System.out.println("3. Converter para Libra (GBP)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite o valor em reais (R$): ");
                double valorBRL = sc.nextDouble();
                double convertido = 0.0;
                String moeda = "";

                switch (opcao) {
                    case 1:
                        convertido = valorBRL / DOLAR;
                        moeda = "Dólar (USD)";
                        break;
                    case 2:
                        convertido = valorBRL / EURO;
                        moeda = "Euro (EUR)";
                        break;
                    case 3:
                        convertido = valorBRL / LIBRA;
                        moeda = "Libra (GBP)";
                        break;
                }

                System.out.printf("R$ %.2f equivale a %.2f %s%n", valorBRL, convertido, moeda);
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Encerrando o conversor. Até mais!");
        sc.close();
    }
}

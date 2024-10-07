package questão2;

import java.util.Scanner;

public class SistemaControleProduto {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();

        System.out.println("Digite o nome do produto:");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.println("Digite o tamanho/peso do produto:");
        double tamanhoPeso = scanner.nextDouble();

        System.out.println("Digite a cor do produto:");
        scanner.nextLine();
        String cor = scanner.nextLine();

        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();

        System.out.println("Digite a quantidade no estoque:");
        int quantidadeEstoque = scanner.nextInt();


        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        System.out.println("\nDigite a quantidade a ser vendida:");
        int quantidadeVenda = scanner.nextInt();
        produto.vender(quantidadeVenda);

        System.out.println("\nEscolha o método de pagamento (Pix, Espécie, Transferência, Débito ou Crédito):");
            scanner.nextLine();
        String metodoPagamento = scanner.nextLine();


        double valorFinal = produto.calcularValorComDesconto(metodoPagamento);
        System.out.println("Valor final com o método de pagamento " + metodoPagamento + ": R$" + valorFinal);

        if (metodoPagamento.equalsIgnoreCase("Espécie")) {
            System.out.println("Digite o valor pago:");
            double valorPago = scanner.nextDouble();
            double troco = produto.calcularTroco(valorPago, valorFinal);
            if (troco > 0) {
                System.out.println("Troco: R$" + troco);
            } else {
                System.out.println("Sem troco.");
            }
        }


        if (metodoPagamento.equalsIgnoreCase("Crédito")) {
            double valorParcela = produto.parcelarEm3x();
            System.out.println("O valor da parcela em 3x sem juros: R$" + valorParcela);
        }

        scanner.close();
    }
}

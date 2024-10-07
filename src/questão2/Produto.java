package questão2;

public class Produto {
    private int codigo;
    private String nome;
    private double tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, double tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getTamanhoPeso() {
        return tamanhoPeso;
    }

    public String getCor() {
        return cor;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    public void vender(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada. Quantidade em estoque agora: " + this.quantidadeEstoque);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }


    public double calcularValorComDesconto(String metodoPagamento) {
        double valorFinal = this.valor;
        if (metodoPagamento.equalsIgnoreCase("Pix") ||
                metodoPagamento.equalsIgnoreCase("Espécie") ||
                metodoPagamento.equalsIgnoreCase("Transferência") ||
                metodoPagamento.equalsIgnoreCase("Débito")) {
            valorFinal = this.valor * 0.95;
        }
        return valorFinal;
    }


    public double calcularTroco(double valorPago, double valorProduto) {
        if (valorPago > valorProduto) {
            return valorPago - valorProduto;
        } else {
            return 0;
        }
    }


    public double parcelarEm3x() {
        return this.valor / 3;
    }
}

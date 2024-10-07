package questão1;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota3() {
        return nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Parabéns, você está Aprovado.";
        } else if (media < 4) {
            return "Reprovado";
        } else {
            return "Na Final";
        }
    }
}

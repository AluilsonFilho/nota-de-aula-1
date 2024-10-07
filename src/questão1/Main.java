package questão1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Digite seu nome:");
        a.setNome(sc.nextLine());

        System.out.println("Digite sua primeira nota:");
        a.setNota1(sc.nextDouble());

        System.out.println("Digite sua segunda nota:");
        a.setNota2(sc.nextDouble());

        System.out.println("Digite sua terceira nota:");
        a.setNota3(sc.nextDouble());

        System.out.println("Notas do aluno:");
        System.out.println("Nota 1: " + a.getNota1());
        System.out.println("Nota 2: " + a.getNota2());
        System.out.println("Nota 3: " + a.getNota3());

        double media = a.calcularMedia();
        System.out.println("Média: " + media);
        System.out.println("Situação: " + a.verificarSituacao());
    }
}

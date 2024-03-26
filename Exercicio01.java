import java.util.Scanner;

public class Exercicio01 {
    private String nome;
    private double nota1, nota2, nota3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public String getNome() {
        return nome;
    }
}

class Main01 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Exercicio01 aluno = new Exercicio01();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        aluno.setNome(nome);

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        aluno.setNotas(nota1, nota2, nota3);

        double media = aluno.calcularMedia();

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média do aluno: " + media);
    }
}

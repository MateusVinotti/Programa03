import java.util.Scanner;

class Exercicio03 {
    private String nome;
    private double salarioFixo;
    private int totalVendas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double calcularSalarioFinal() {
        double comissao = totalVendas * 0.15;
        return salarioFixo + comissao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}

class Main03 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Exercicio03 vendedor = new Exercicio03();

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();
        vendedor.setNome(nome);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        vendedor.setSalarioFixo(salarioFixo);

        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mês: ");
        int totalVendas = scanner.nextInt();
        vendedor.setTotalVendas(totalVendas);

        double salarioFinal = vendedor.calcularSalarioFinal();

        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo do vendedor: " + vendedor.getSalarioFixo());
        System.out.println("Salário no final do mês: " + salarioFinal);
    }
}

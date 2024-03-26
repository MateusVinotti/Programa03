import java.util.Scanner;

class Exercicio05 {
    private double valorCompra;

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularValorPrestacao() {
        return valorCompra / 5;
    }
}

class Main05 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Exercicio05 prestacoes = new Exercicio05();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        prestacoes.setValorCompra(valorCompra);

        double valorPrestacao = prestacoes.calcularValorPrestacao();

        System.out.println("O valor de cada prestação é: R$" + valorPrestacao);
    }
}

import java.util.Scanner;

class Exercicio04 {
    private double cotacaoDolar;
    private double quantidadeDolar;

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public void setQuantidadeDolar(double quantidadeDolar) {
        this.quantidadeDolar = quantidadeDolar;
    }

    public double converterParaReais() {
        return quantidadeDolar * cotacaoDolar;
    }
}

class Main04 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Exercicio04 conversor = new Exercicio04();

        System.out.print("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();
        conversor.setCotacaoDolar(cotacaoDolar);

        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolar = scanner.nextDouble();
        conversor.setQuantidadeDolar(quantidadeDolar);

        double valorEmReais = conversor.converterParaReais();

        System.out.println("Valor em reais (R$): " + valorEmReais);
    }
}

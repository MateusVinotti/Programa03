import java.util.Scanner;

public class Exercicio02 {
    private double distanciaTotal;
    private double combustivelGasto;

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumoMedio() {
        return distanciaTotal / combustivelGasto;
    }
}
class Main02 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Exercicio02 carro = new Exercicio02();

        System.out.print("Digite a distância total percorrida pelo automóvel (em km): ");
        double distanciaTotal = scanner.nextDouble();
        carro.setDistanciaTotal(distanciaTotal);

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivelGasto = scanner.nextDouble();
        carro.setCombustivelGasto(combustivelGasto);

        double consumoMedio = carro.calcularConsumoMedio();

        System.out.println("Consumo médio do automóvel: " + consumoMedio + " km/l");
    }
}

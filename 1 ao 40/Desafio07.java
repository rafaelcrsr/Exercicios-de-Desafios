import java.util.Scanner;

public class Desafio07 {
  public Desafio07() {}

  public void Executar() {
    double pre, pred;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor inicial do produto: ");
    pre = sc.nextInt();

    pred = pre * 0.95;

    System.out.println("\n Valor do produto com 5% de desconto: " + pred);

  }

  public static void main(String[] args) {

    Desafio07 desafio07;
    desafio07 = new Desafio07();
    desafio07.Executar();
  }

}

import java.util.Scanner;

public class Desafio10 {
  public Desafio10() {}

  public void Executar() {
    double Kmp, Dal, pre;

    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a distância percorrida em KM: ");
    Kmp = sc.nextDouble();

    System.out.print("Informe a quantidade de dias alugados: ");
    Dal = sc.nextDouble();

    pre = (Kmp * 0.15) + (Dal * 60);

    System.out.println("Preço a pagar é de " + " " + "R$" + pre);
  }

  public static void main(String[] args) {
    Desafio10 desafio10;
    desafio10 = new Desafio10();
    desafio10.Executar();
  }
}

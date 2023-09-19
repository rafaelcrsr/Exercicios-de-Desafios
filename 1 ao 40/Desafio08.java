import java.util.Scanner;

public class Desafio08 {
  public Desafio08() {}
 
  public void Executar() {
    double sal, saln;

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor do salário: ");
    sal = sc.nextInt();

    saln = sal * 1.15;
    System.out.println("\n Novo valor do salário com aumento de 15%:" + saln);
  }

  public static void main(String[] args) {

    Desafio08 desafio08;
    desafio08 = new Desafio08();
    desafio08.Executar();
  }
}

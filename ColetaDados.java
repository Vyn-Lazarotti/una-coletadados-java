import java.util.Scanner;

public class ColetaDados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Sistema de seleção CODE"); // Kamen Rider Zeztz
    System.out.println("Insira os dados do candidato");

    System.out.println("Nome completo: ");
    String nome = sc.nextLine();

    System.out.println("Insira a idade: ");
    int idade = sc.nextInt();

    System.out.println("Insira a altura (em metros): ");
    double altura = sc.nextDouble();

    System.out.println("Insira o peso: ");
    double peso = sc.nextDouble();

    System.out.println("Insira se concluiu o dream learning (true/false): ");
    boolean treinamento = sc.nextBoolean();

    System.out.println("Loading...");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade + " anos");
    System.out.println("Altura: " + altura + " metros");
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Completou o treinamento? " + (treinamento ? "Sim" : "Não"));

    if (idade < 20 && idade >= 40){
        System.out.println("Aceito");
    }
    else{
        System.out.println("Recusado");
    }

    System.out.println("Processo concluído!");
    System.out.println("Bem-vindo Seven!");

    sc.close();
  }
}

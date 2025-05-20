package cofre;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
        int opcao = 0;
        
        do {
            System.out.println("\n=== MENU COFRINHO ===");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    System.out.println("4 - Libra");
                    System.out.println("5 - Iene");
                    int tipo = scanner.nextInt();
                    
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    
                    switch (tipo) {
                        case 1:
                            cofrinho.adicionarMoeda(new Real(valor));
                            break;
                        case 2:
                            cofrinho.adicionarMoeda(new Dolar(valor));
                            break;
                        case 3:
                            cofrinho.adicionarMoeda(new Euro(valor));
                            break;
                        case 4:
                            cofrinho.adicionarMoeda(new Libra(valor));
                            break;
                        case 5:
                            cofrinho.adicionarMoeda(new Iene(valor));
                            break;
                        default:
                            System.out.println("Moeda inválida.");
                    }
                    break;
                    
                case 2:
                    System.out.println("Funcionalidade ainda em construção! (remover moeda específica)");
                    break;
                    
                case 3:
                    cofrinho.listarMoedas();
                    break;
                    
                case 4:
                    double total = cofrinho.calcularTotalEmReal();
                    System.out.printf("Total em Real: R$ %.2f\n", total);
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
}
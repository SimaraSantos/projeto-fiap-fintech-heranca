package br.fintech.fiap.heranca;

import br.fintech.fiap.heranca.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<MovimentacaoFinanceira> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n======= MENU PRINCIPAL =======");
            System.out.println("1 - Registrar Investimento");
            System.out.println("2 - Registrar Gasto Comum");
            System.out.println("3 - Registrar Gasto de Lazer");
            System.out.println("4 - Exibir Relatório e Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo de Investimento: ");
                    String tipo = leitor.nextLine();
                    System.out.print("Valor: ");
                    double v1 = leitor.nextDouble();
                    lista.add(new Investimento(lista.size() + 1, LocalDate.now(), v1, "Investimento", tipo, "Renda Fixa"));
                    System.out.println(">> Investimento adicionado!");
                    break;

                case 2:
                    System.out.print("Descrição do Gasto: ");
                    String desc = leitor.nextLine();
                    System.out.print("Valor: ");
                    double v2 = leitor.nextDouble();
                    lista.add(new Gasto(lista.size() + 1, LocalDate.now(), v2, desc, "Cartão", "Geral"));
                    System.out.println(">> Gasto comum adicionado!");
                    break;

                case 3:
                    System.out.print("Local do Lazer: ");
                    String local = leitor.nextLine();
                    System.out.print("Valor: ");
                    double v3 = leitor.nextDouble();
                    lista.add(new GastoLazer(lista.size() + 1, LocalDate.now(), v3, "Diversão", "Dinheiro", "Lazer", local));
                    System.out.println(">> Gasto de lazer adicionado!");
                    break;

                case 4:
                    System.out.println("\n=== RELATÓRIO FINAL ===");
                    for (MovimentacaoFinanceira m : lista) {
                        m.mostrarDados();
                        System.out.println("-----------------------");
                    }
                    System.out.println("Total de registros: " + lista.size());
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            if (opcao != 4) {
                System.out.println("\nO que deseja fazer agora?");
            }

        } while (opcao != 4);

        System.out.println("Sistema encerrado. Até logo!");
        leitor.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadevendas;

// Importa o Scanner
import java.util.Scanner;

/**
 * ## Padrao GRASP: Controller (Controlador) ##
 *
 * Onde: Esta classe inteira.
 *
 * Por que: Esta classe e a "fronteira" do sistema. Ela e a unica que
 * lida diretamente com a entrada do usuario (o Scanner). Ela nao faz a
 * logica de negocios, mas ela *recebe o pedido*
 * (ex: "comprar assento 5") e *delega* para as classes corretas.
 */
public class VendaController {

    private Evento evento;
    private Bilheteria bilheteria;
    private Scanner scanner;

    public VendaController(Evento evento, Bilheteria bilheteria, Scanner scanner) {
        this.evento = evento;
        this.bilheteria = bilheteria;
        this.scanner = scanner;
    }

    public void iniciarMenu() {
        boolean rodando = true;
        
        System.out.println("Bem-vindo a Bilheteria do " + evento.getNome() + "!");

        while (rodando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver assentos disponiveis");
            System.out.println("2. Comprar ingresso");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.mostrarAssentos();
                    break;
                case 2:
                    this.comprarIngresso();
                    break;
                case 0:
                    rodando = false; 
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    private void mostrarAssentos() {
        System.out.println("\n--- Mapa de Assentos ('[X]' = Ocupado) ---");
        int capacidade = evento.getCapacidade();
        
        for (int i = 1; i <= capacidade; i++) {
            if (evento.assentoEstaVendido(i)) {
                System.out.print("[ X ] ");
            } else {
                System.out.printf("[ %d ] ", i); // Imprime o numero do assento
            }
            // Quebra a linha a cada 5 assentos
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n-----------------------------------------");
    }

    private void comprarIngresso() {
        System.out.println("\n--- Comprar Ingresso ---");
        System.out.print("Qual numero do assento voce deseja? ");
        
        int numeroAssento = scanner.nextInt();

        Ingresso novoIngresso = bilheteria.venderIngresso(evento, numeroAssento);

        if (novoIngresso != null) {
            System.out.println("Compra efetuada com sucesso!");
            novoIngresso.exibirDetalhes();
        } else {
            System.out.println("Nao foi possivel concluir a compra.");
        }
    }
}
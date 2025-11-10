/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sistemadevendas;

/**
 * ## Principio GRASP: High Cohesion (Alta Coesao) ##
 *
 * Onde: A classe inteira.
 *
 * Por que: A responsabilidade desta classe e unicamente armazenar e 
 * exibir informacoes sobre um ingresso especifico. Ela nao tenta vender,
 * nao tenta verificar assento. Ela so faz o seu trabalho.
 */
public class Ingresso {
    private Evento evento;
    private int numeroAssento;

    public Ingresso(Evento evento, int numeroAssento) {
        this.evento = evento;
        this.numeroAssento = numeroAssento;
    }

    public void exibirDetalhes() {
        System.out.println("--- Ingresso Gerado ---");
        System.out.println("Evento: " + evento.getNome());
        System.out.println("Preco: R$ " + evento.getPrecoIngresso());
        System.out.println("Assento: " + numeroAssento);
        System.out.println("-----------------------");
    }
}
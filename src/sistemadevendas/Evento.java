/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sistemadevendas;

import java.util.ArrayList;
import java.util.List;

/**1
 * ## Padrao GRASP: Information Expert (Especialista da Informacao) ##
 *
 * Onde: Nos metodos assentoEstaVendido(), verificarDisponibilidade() e registrarVenda().
 *
 * Por que: A classe Evento e a unica que possui a 'lista de assentos vendidos'
 * e a 'capacidade'. Portanto, ela e a especialista em responder se um
 * assento esta disponivel, ocupado ou se existe.
 */
public class Evento {
    private String nome;
    private double precoIngresso;
    private int capacidade;
    private List<Integer> assentosVendidos;

    public Evento(String nome, double precoIngresso, int capacidade) {
        this.nome = nome;
        this.precoIngresso = precoIngresso;
        this.capacidade = capacidade;
        this.assentosVendidos = new ArrayList<>();
    }
    
    public boolean assentoEstaVendido(int numeroAssento) {
        return this.assentosVendidos.contains(numeroAssento);
    }

    public boolean verificarDisponibilidade(int numeroAssento) {
        if (numeroAssento <= 0 || numeroAssento > this.capacidade) {
            System.out.println("Erro: O assento " + numeroAssento + " nao existe (Capacidade e 1-" + this.capacidade + ").");
            return false;
        }
        
        if (assentoEstaVendido(numeroAssento)) {
            System.out.println("Erro: O assento " + numeroAssento + " ja foi vendido.");
            return false;
        }
        
        return true;
    }

    public void registrarVenda(int numeroAssento) {
        this.assentosVendidos.add(numeroAssento);
    }

    // Getters
    public String getNome() { return nome; }
    public double getPrecoIngresso() { return precoIngresso; }
    public int getCapacidade() { return capacidade; }
}
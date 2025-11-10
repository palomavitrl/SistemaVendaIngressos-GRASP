
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sistemadevendas;

/**
 * ## Padrao GRASP: Creator (Criador) ##
 *
 * Onde: No metodo venderIngresso().
 *
 * Por que: A Bilheteria e a classe ideal para criar o objeto Ingresso.
 * Ela "agrega" o Ingresso no contexto da venda, e ela 
 * ja possui os dados necessarios (o Evento e o assento) para
 * instanciar o Ingresso.
 */
public class Bilheteria {

    public Ingresso venderIngresso(Evento evento, int numeroAssento) {
        
        System.out.println("Verificando disponibilidade do assento " + numeroAssento + "...");
        
        if (evento.verificarDisponibilidade(numeroAssento)) {
            
            evento.registrarVenda(numeroAssento);

            // APLICACAO DO CREATOR
            Ingresso novoIngresso = new Ingresso(evento, numeroAssento);

            System.out.println("Assento reservado. Gerando ingresso...");
            return novoIngresso;
            
        } else {
            return null;
        }
    }
}
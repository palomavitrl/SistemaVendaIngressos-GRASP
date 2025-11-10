/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadevendas;

// Importa o Scanner para ler o teclado
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 1. Configuracao Inicial do Sistema
        
        // MUDAÇA AQUI: Agora é um "Show de Opera" com 20 assentos
        Evento showOpera = new Evento("Show de Opera", 150.00, 20); 
        
        // Cria a Bilheteria (Creator)
        Bilheteria bilheteria = new Bilheteria();
        
        // Cria a ferramenta para ler o teclado
        Scanner scanner = new Scanner(System.in);

        // 2. Inicia o Padrao Controller
        VendaController controlador = new VendaController(showOpera, bilheteria, scanner);
        
        // Inicia o loop principal do programa
        controlador.iniciarMenu();
        
        // 3. O Main só volta aqui quando o usuário sai do loop
        System.out.println("Obrigado por usar o Sistema de Vendas!");
        scanner.close();
    }
}
# SistemaVendaIngressos-GRASP

Projeto acadêmico de um sistema de venda de ingressos ("Show de Opera") em Java. O objetivo é aplicar na prática os padrões GRASP (Controller, Expert, Creator) em um console interativo.

## Como Executar

1.  Clone o projeto.
2.  Abra o projeto em uma IDE Java (NetBeans, IntelliJ, etc.).
3.  Execute o arquivo `src/sistemadevendas/Main.java`.

## Funcionalidades

* Menu interativo via console.
* Visualização do mapa de assentos (disponíveis e ocupados).
* Compra de ingressos com escolha de assento.
* Validação de assentos (existentes ou já vendidos).

## Padrões GRASP Aplicados

O projeto demonstra os seguintes padrões:

* **Controller (`VendaController.java`):** Recebe a entrada do usuário (menu) e coordena o fluxo, delegando a lógica para outras classes.
* **Information Expert (`Evento.java`):** É o especialista que possui a lista de `assentosVendidos` e a `capacidade`. Única classe que pode validar a disponibilidade de um assento.
* **Creator (`Bilheteria.java`):** Responsável por criar (instanciar) o objeto `Ingresso` após uma venda ser validada.

O projeto também segue os princípios de **Alta Coesão** (classes com responsabilidade única) e **Baixo Acoplamento** (classes independentes).


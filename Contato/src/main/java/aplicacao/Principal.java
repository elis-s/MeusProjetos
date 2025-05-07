/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacao;

import java.util.Scanner;
import contato.Agenda;
import contato.Contato;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos contatos gpstaria de adicionar? ");
        int qtdContato = teclado.nextInt();
        
        for(int i = 0; i < qtdContato; i++){
            System.out.println("Nome: ");
            String nome = teclado.nextLine();
            System.out.println("Telefone: ");
            int telefone = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Data de Aniversario: ");
            teclado.nextLine();
            String dataAniversario = teclado.nextLine();
            System.out.println("Email: ");
            teclado.nextLine();
            String email = teclado.nextLine();
            
            Agenda agenda = new Agenda();
            
            System.out.println("(1) ADICIONAR CONTATO"
                    + "\n"
                    + "(2) CONSULTAR CONTATO"
                    + "\n"
                    + "(3) LISTAR CONTATOS"
                    + "\n"
                    + "(4) LISTAR ANIVERSARIANTES");
            int escolha = teclado.nextInt();
            
             switch (escolha) {
                case 1:
                    if (agenda.addContato(nome, telefone, dataAniversario, email)) {
                        System.out.println("Contato adicionado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do contato: ");
                    String nomeConsulta = teclado.nextLine();
                    String resultado = agenda.consultar(nomeConsulta);
                    if (!resultado.equals("Não Encontrado")) {
                        System.out.println(resultado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("LISTA DE CONTATOS:");
                    agenda.exibirContatos();
                    break;

                case 4:
                    System.out.print("Digite o número do mês (1 a 12): ");
                    int mes = teclado.nextInt();
                    teclado.nextLine();
                    String aniversariantes = agenda.aniversarianteMes(mes);
                    if (!aniversariantes.isEmpty()) {
                        System.out.println("ANIVERSARIANTES DO MÊS:");
                        System.out.println(aniversariantes);
                    } else {
                        System.out.println("Nenhum aniversariante encontrado para esse mês.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
            
        }

        
    }
    


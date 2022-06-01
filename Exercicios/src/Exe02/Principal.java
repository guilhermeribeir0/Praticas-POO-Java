package Exe02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Agenda agenda = new Agenda();

        String nomeInformado;
        int idadeInformada;
        float alturaInformada;
        int escolha = 0;

        System.out.println("---- Bem Vindo(a) a Agenda ----");

        for (int i = 0; escolha != 6; i++) {
            System.out.println("1 - Adicionar Pessoa \n2 - Remover Pessoa \n3 - Buscar Pessoa \n4 - Listar (Tudo) \n5 - Listar (Especifico) \n6 - Sair");
            System.out.print("Informe uma das opções acima: ");
            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    System.out.print("Informe quantas pessoas quer cadastrar: ");
                    int quantidadePessoas = input.nextInt();

                    for (int k = 0; k < quantidadePessoas; k++) {
                        System.out.print("Informe o nome: ");
                        nomeInformado = input.next();
                        System.out.print("Informe a idade: ");
                        idadeInformada = input.nextInt();
                        System.out.print("Informe a altura: ");
                        alturaInformada = input.nextFloat();
                        agenda.armazenaPessoa(nomeInformado, idadeInformada, alturaInformada);
                    }
                    System.out.println("****( Concluido com sucesso )****\n-------------------------");
                    break;

                case 2:
                    System.out.print("Informe o nome da pessoa: ");
                    String pessoaRemover = input.next();
                    agenda.removePessoa(pessoaRemover);
                    System.out.println("****( Concluido com sucesso )****\n-------------------------");
                    break;

                case 3:
                    System.out.print("Informe o nome da pessoa: ");
                    String pessoaPesquisada = input.next();
                    agenda.buscaPessoa(pessoaPesquisada);
                    System.out.println("****( Concluido com sucesso )****\n-------------------------");
                    break;

                case 4:
                    agenda.imprimeAgenda();
                    System.out.println("****( Concluido com sucesso )****\n-------------------------");
                    break;

                case 5:
                    System.out.print("Informe a posição: ");
                    int pessoaListar = input.nextInt();
                    agenda.imprimePessoa(pessoaListar);
                    System.out.println("****( Concluido com sucesso )****\n-------------------------");
                    break;

                case 6:
                    System.out.println("------------------------ \n**** PROGRAMA FINALIZADO! ****");
                    break;
            }
        }
    }
}
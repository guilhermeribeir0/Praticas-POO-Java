package Exe02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Agenda agenda = new Agenda();

        String[] nomeInformado = new String[10];
        int[] idadeInformada = new int[10];
        float[] alturaInformada = new float[10];
        int escolha;

        System.out.println("---- Bem Vindo(a) a Agenda ----");
        System.out.println("1 - Adicionar Pessoa \n2 - Remover Pessoa \n3 - Buscar Pessoa \n4 - Listar (Tudo) \n5 - Listar (Especifico) \n6 - Sair");
        System.out.print("Informe uma das opções acima: ");
        escolha = input.nextInt();

        if (escolha < 6) {
            switch (escolha) {
                case 1:
                    System.out.println("Informe quantas pessoas quer cadastrar: ");
                    int quantidadePessoas = input.nextInt();
                    for (int i = 0; i < quantidadePessoas; i++) {
                        if (nomeInformado[i] == null ) {
                            System.out.print("Informe o nome: ");
                            nomeInformado[i] = input.next();
                            System.out.print("Informe a idade: ");
                            idadeInformada[i] = input.nextInt();
                            System.out.print("Informe a altura: ");
                            alturaInformada[i] = input.nextFloat();
                            agenda.armazenaPessoa(nomeInformado, idadeInformada, alturaInformada);
                        }
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
            agenda.imprimeAgenda();
        }
        System.out.println("-------------------- \nPrograma Finalizado! \n--------------------");
    }

}

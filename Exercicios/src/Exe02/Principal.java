package Exe02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Agenda pessoa1 = new Agenda();
        int escolha = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao sistema de Cadastro de Pessoas");
        System.out.println("1 - Adicionar \n2 - Remover \n3 - Buscar \n4 - Exibir(Todas) \n5 - Exibir(Pessoa) ");
        System.out.println("Escolha o numero correspondente a opção desejada: ");
        escolha = input.nextInt();

    }

}

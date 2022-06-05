package Exe03;

import java.util.Scanner;

public class Principal3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Elevador elevador = new Elevador();

        int escolha = 0;

        System.out.println("------ Bem vindo(a) ------");
        System.out.print("Informe a capacidade do Elevador: ");
        int capacidade = input.nextInt();
        System.out.print("Informe o total de andares do prédio: ");
        int andares = input.nextInt();
        elevador.inicializa(capacidade, andares);

        for (int i = 0; escolha != 5; i++) {
            System.out.println("----------- Elevador -----------\nCapacidade Total: 10 Pessoas");
            System.out.println("1 - Entra \n2- Sai \n3 - Subir \n4 - Descer \n5 - Parar Programa");
            System.out.print("Escolha uma das opcoes acima: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Entraram (qtd): ");
                    int pessoasEntram = input.nextInt();
                    elevador.entra(pessoasEntram);
                    break;
                case 2:
                    System.out.print("Sairam (qtd): ");
                    int pessoasSai = input.nextInt();
                    elevador.sai(pessoasSai);
                    break;
                case 3:
                    elevador.sobe();
                    break;
                case 4:
                    elevador.desce();
                    break;
                case 5:
                    System.out.println("---------------------\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("**( Opção informada não existe! )**");
                    break;
            }
        }
    }

}

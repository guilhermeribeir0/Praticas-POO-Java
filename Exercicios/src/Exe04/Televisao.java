package Exe04;

import java.util.Scanner;

public class Televisao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ControleRemoto controle = new ControleRemoto();

        System.out.println("Iniciando TV! \nBem vindo(a)!");
        System.out.println("Total de Canais: 30 \nVolume Máximo: 100");

        int escolha = 0;

        for(int i = 0; escolha != 7; i++) {
            System.out.println("--------------------------");
            System.out.println("1 - Aumentar Volume \n2 - Diminuir Volume \n3 - Aumentar Canal \n4 - Diminuir Canal \n5 - Trocar canal \n6 - Consultar TV \n7 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    controle.aumentarVolume();
                    break;
                case 2:
                    controle.diminuirVolume();
                    break;
                case 3:
                    controle.aumentarCanal();
                    break;
                case 4:
                    controle.diminuirCanal();
                    break;
                case 5:
                    System.out.print("Informe o canal: ");
                    int canalDesejado = input.nextInt();
                    controle.trocarCanal(canalDesejado);
                    break;
                case 6:
                    controle.consultar();
                    break;
                case 7:
                    System.out.println("TV Finalizada!");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }
        }

    }

}

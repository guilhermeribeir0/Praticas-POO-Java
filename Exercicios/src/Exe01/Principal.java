package Exe01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Scanner input =  new Scanner(System.in);

        System.out.println("Olá, insira seus dados nos campos abaixo:");
        System.out.print("Nome: ");
        pessoa.setNome(input.nextLine());
        System.out.println("Data de Nascimento:");
        System.out.print("Dia: ");
        pessoa.setDiaNascimento(input.nextInt());
        System.out.print("Mes: ");
        pessoa.setMesNascimento(input.nextInt());
        System.out.print("Ano: ");
        pessoa.setAnoNascimento(input.nextInt());
        System.out.print("Altura: ");
        pessoa.setAltura(input.nextDouble());
        System.out.println("--------------------");
        pessoa.imprimirDados();
        pessoa.calcularIdade();
    }

}

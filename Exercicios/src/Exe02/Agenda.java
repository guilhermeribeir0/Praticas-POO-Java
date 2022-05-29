package Exe02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agenda{

    private String[] nome = new String[10];
    private int[] idade = new int[10];
    private float[] altura = new float[10];

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public float[] getAltura() {
        return altura;
    }

    public void setAltura(float[] altura) {
        this.altura = altura;
    }

    public void armazenaPessoa(String nome[], int idade[], float altura[]) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
    }

    public void removePessoa(String nome) {

    }

    //Temporario
    public int buscaPessoa(String nome) {
        return 0;
    }

    public void imprimeAgenda() {
        System.out.println(" ID |  NOME  |  IDADE  |  ALTURA ");
        System.out.println("---------------------------------");
        for (int i = 0; i < nome.length; i++) {
            if(nome[i] == null) {
                System.out.println(i + " " + "Não Preenchido!  |   0   |   0,00  ");
            } else {
                System.out.println(i + " | " + nome[i] + " | " + idade[i] + " | " + altura[i]);
            }
        }
    }

    public void imprimePessoa(int index) {

    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome=" + Arrays.toString(nome) +
                ", idade=" + Arrays.toString(idade) +
                ", altura=" + Arrays.toString(altura) +
                '}';
    }
}

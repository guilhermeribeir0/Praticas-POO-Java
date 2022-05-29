package Exe02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agenda{

    private List<String> nome = new ArrayList<>();
    private List<Integer> idade = new ArrayList<>();
    private List <Float> altura = new ArrayList<>();

    public List<String> getNome() {
        return nome;
    }

    public void setNome(List<String> nome) {
        this.nome = nome;
    }

    public List<Integer> getIdade() {
        return idade;
    }

    public void setIdade(List<Integer> idade) {
        this.idade = idade;
    }

    public List<Float> getAltura() {
        return altura;
    }

    public void setAltura(List<Float> altura) {
        this.altura = altura;
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
            this.nome.add(nome);
            this.idade.add(idade);
            this.altura.add(altura);
    }

    public void removePessoa(String nome) {

    }

    //Temporario
    public int buscaPessoa(String nome) {
        return 0;
    }

    public void imprimeAgenda() {
            System.out.println("Nomes: " + nome + "\nIdades: " + idade + "\nAlturas: " + altura);
    }

    public void imprimePessoa(int index) {

    }
}

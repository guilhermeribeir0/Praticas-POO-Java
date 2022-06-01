package Exe02;

import java.util.ArrayList;
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
        int index = getNome().indexOf(nome);
        this.nome.remove(index);
        this.idade.remove(index);
        this.altura.remove(index);
    }

    public int buscaPessoa(String nome) {
        int index = getNome().indexOf(nome);
        System.out.println("Posicao no cadastro: " + index);
        return index;
    }

    public void imprimeAgenda() {
            System.out.println("Nomes: " + nome + "\nIdades: " + idade + "\nAlturas: " + altura);
    }

    public void imprimePessoa(int index) {
        if (index < getNome().size()) {
            System.out.println("Nome: " + nome.get(index) + "\nIdade: " + idade.get(index) + "\nAltura: " + altura.get(index));
        } else {
            System.out.println("Não existe cadastro!");
        }
    }
}

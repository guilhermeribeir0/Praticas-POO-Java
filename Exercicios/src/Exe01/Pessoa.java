package Exe01;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

public class Pessoa {

    private String nome;
    private int diaNascimento, mesNascimento, anoNascimento;
    private double altura;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirDados () {
        System.out.println("Nome: "+nome);
        System.out.println("Data de Nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
        System.out.println("Altura: "+altura);
    }

    public void calcularIdade () {
            idade = LocalDate.now().getYear() - getAnoNascimento();
            System.out.println("Idade: "+idade+" anos");
    }
}

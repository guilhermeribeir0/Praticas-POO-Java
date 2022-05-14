package Exe02;

import java.util.ArrayList;

public class Agenda extends Pessoa{

    private String nomeInformado;
    private int idadeInformada;

    ArrayList nomePessoa = new ArrayList<String>();
    ArrayList idadePessoa = new ArrayList<>();

    public void setNomeInformado(String nomeInformado) {
        this.nomeInformado = nomeInformado;
    }

    public String getNomeInformado() {
        return nomeInformado;
    }

    public void setIdadeInformada(int idadeInformada) {
        this.idadeInformada = idadeInformada;
    }

    public int getIdadeInformada() {
        return idadeInformada;
    }

    public void adicionaPessoa() {
        nomePessoa.add(getNome());
    }

    public void removePessoa () {
        idadePessoa.remove(idadeInformada);
    }
}

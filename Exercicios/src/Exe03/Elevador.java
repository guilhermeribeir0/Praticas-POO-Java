package Exe03;

public class Elevador {

    private int terreo = 0, andar, totalAndares, capacidadeElevador, quantidadePessoas;

    public void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andar = this.terreo;
    }

    public void entra(int pessoasEntra) {
        if(pessoasEntra <= (capacidadeElevador - quantidadePessoas)) {
            quantidadePessoas += pessoasEntra;
            capacidadeElevador -= pessoasEntra;
            System.out.println("Pessoas no elevador: " + quantidadePessoas);
        } else {
            System.out.println("**( Capacidade Máxima Atingida! )**");
        }
    }

    public void sai(int pessoasSai) {
        if(pessoasSai <= (quantidadePessoas + quantidadePessoas)){
            quantidadePessoas -= pessoasSai;
            capacidadeElevador += pessoasSai;
            System.out.println("Pessoas no elevador: " + quantidadePessoas);
        } else {
            System.out.println("**( Não permitido! )**");
        }
    }

    public void sobe() {
        if(andar >= 0 && andar < totalAndares) {
            andar++;
            System.out.println("Andar: " + andar);
        } else {
            System.out.println("**( Ultimo andar! )**");
        }
    }

    public void desce() {
        if(andar > 0 && andar <= totalAndares) {
            andar--;
            if(andar == 0) {
                System.out.println("Andar: Térreo");
            } else {
                System.out.println("Andar: " + andar);
            }
        } else {
            System.out.println("**( Está no Térreo! )**");
        }
    }
}

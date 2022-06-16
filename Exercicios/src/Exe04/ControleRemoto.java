package Exe04;

public class ControleRemoto {

    private int volume = 0;
    private int canal = 1;

    public void aumentarVolume () {
        if (volume < 100) {
            this.volume++;
            System.out.println("Volume atual: " + volume);
        } else {
            System.out.println("Volume Máximo!");
        }
    }

    public void diminuirVolume () {
        if (volume > 0) {
            this.volume--;
            System.out.println("Volume atual: " + volume);
        } else {
            System.out.println("Volume Minimo!");
        }
    }

    public void aumentarCanal () {
        if(canal == 30) {
            System.out.println("Não existe mais canais!");
        } else {
            this.canal++;
            System.out.println("Canal atual: " + canal);
        }
    }

    public void diminuirCanal () {
        if(canal == 1) {
            System.out.println("Não permitido!");
        } else {
            this.canal--;
            System.out.println("Canal atual: " + canal);
        }
    }

    public void trocarCanal (int canalSelecionado) {
        if (canalSelecionado >= 1 && canalSelecionado <= 30) {
            this.canal = canalSelecionado;
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Não existe esse canal!");
        }
    }

    public void consultar() {
        System.out.println("Volume atual: " + volume + "\nCanal atual: " + canal);
    }
}

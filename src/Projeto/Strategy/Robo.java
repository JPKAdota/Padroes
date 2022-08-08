package Projeto.Strategy;

public class Robo {
    private comportamento comportamento;

    public void setComportamento(Projeto.Strategy.comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }


}

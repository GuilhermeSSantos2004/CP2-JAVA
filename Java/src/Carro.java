public class Carro extends Veiculo {
    private boolean arCondicionadoAtivado;

    public Carro(String marca, String modelo, int ano, int velocidadeAtual, boolean arCondicionadoAtivado) {
        super(marca, modelo, ano, 180, velocidadeAtual); 
        if (velocidadeAtual > 180){
            System.out.println("A velocidade foi ajustada para 180 km/h.");
            super.setVelocidadeAtual(180);
        }
        this.arCondicionadoAtivado = arCondicionadoAtivado;
    }

    public void ligarArCondicionado() {
        if (getVelocidadeAtual() > 0) {
            arCondicionadoAtivado = true;
            System.out.println("Ar condicionado ligado.");
        } else {
            System.out.println("O carro precisa estar em movimento para ligar o ar condicionado.");
        }
    }

    public void desligarArCondicionado() {
        arCondicionadoAtivado = false;
        System.out.println("Ar condicionado desligado.");
    }

    public boolean isArCondicionadoAtivado() {
        return arCondicionadoAtivado;
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Ar Condicionado: " + (arCondicionadoAtivado ? "Ativado" : "Desativado"));
    }
}

public class Carro extends Veiculo {
    private boolean arCondicionadoAtivado;

    public Carro(String nome, String modelo, int ano, int velocidadeAtual, boolean arCondicionadoAtivado) {
        super(nome, modelo, ano, 180, velocidadeAtual); // Chama o construtor da classe Veiculo
        if (velocidadeAtual > 180){
            System.out.println("Velocidade atual maior que a velocidade máxima. A velocidade atual será ajustada para a velocidade máxima.");
            super.setVelocidadeAtual(180);// Chamada ao método da classe Veiculo
        }
        this.arCondicionadoAtivado = arCondicionadoAtivado;
    }
    public void ligarArCondicionado() {
        arCondicionadoAtivado = true;
        System.out.println("Ar condicionado ligado.");
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
        super.obterStatus(); // Chama o método da classe Veiculo para obter status básico
        System.out.println("Ar Condicionado: " + (arCondicionadoAtivado ? "Ativado" : "Desativado"));
    }
}

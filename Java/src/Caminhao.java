public class Caminhao extends Veiculo {
    private int capacidadeCarga = 1000;
    private int carga;

    public Caminhao(String marca, String modelo, int ano, int velocidadeAtual, int carga) {
        super(marca, modelo, ano, 100, velocidadeAtual);
        if(carga > capacidadeCarga){
            System.out.println("Carga excede capacidade máxima. Será ajustada para " + capacidadeCarga + " kg.");
            this.carga = capacidadeCarga;
        } else {
            this.carga = carga;
        }
        if (velocidadeAtual > 100){
            System.out.println("Velocidade atual excede limite máximo. Velocidade ajustada para 100 km/h.");
            super.setVelocidadeAtual(100);
        }
    }

    public void incrementarCarga(int quantidade) {
        int novaCarga = carga + quantidade;
        if (novaCarga <= capacidadeCarga) {
            carga = novaCarga;
        } else {
            System.out.println("Carga excede capacidade máxima de " + capacidadeCarga + " kg.");
            carga = capacidadeCarga;
        }
    }

    public void diminuirCarga(int quantidade) {
        int novaCarga = carga - quantidade;
        if (novaCarga >= 0) {
            carga = novaCarga;
        } else {
            System.out.println("Carga não pode ser negativa. Será ajustada para 0 kg.");
            carga = 0;
        }
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Carga: " + carga + " kg");
    }
}

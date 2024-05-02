public class Caminhao extends Veiculo {
    private int capacidadeCarga = 1000;
    private int carga;
    public Caminhao(String nome, String modelo, int ano, int velocidadeAtual, int carga) {
        super(nome, modelo, ano, 100, velocidadeAtual); // Chama o construtor da classe Veiculo
        if(carga>capacidadeCarga){
            System.out.println("Carga ultrapassou a capacidade de carga. Valor se tornara capacidade. Carga: " + capacidadeCarga);
            this.carga = capacidadeCarga;
        }else{
            this.carga = carga;
        }
        if (velocidadeAtual > 100){
            System.out.println("Velocidade atual maior que a velocidade máxima. A velocidade atual será ajustada para a velocidade máxima.");
            super.setVelocidadeAtual(100);// Chamada ao método da classe Veiculo
        }
    }

    public void incrementarCarga(int quantidade) {
        int novaCarga = carga + quantidade;
        if (novaCarga <= capacidadeCarga) {
            carga = novaCarga;
        } else {
            System.out.println("A carga excede a capacidade máxima de " + capacidadeCarga + ". Valor se tornará a capacidade.");
            carga = capacidadeCarga;
        }
    }

    public void diminuirCarga(int quantidade) {
        int novaCarga = carga - quantidade;
        if (novaCarga >= 0) {
            carga = novaCarga;
        } else {
            System.out.println("A carga não pode ser negativa. Valor será colocado como 0.");
            carga = 0;
        }
    }

    @Override
    public void obterStatus() {
        super.obterStatus(); // Chama o método da classe Veiculo para obter status básico
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " Kilos");
    }
}

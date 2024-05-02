public class Veiculo {
    private String nome;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    public Veiculo(String nome, String modelo, int ano, int velocidadeMaxima, int velocidadeAtual) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int incremento) {
        if (velocidadeAtual + incremento > velocidadeMaxima) {
            System.out.println("Velocidade adicionada passou do limite de velocidade máxima, ação inválida. Velocidade máxima: " + velocidadeMaxima);
            return;
        }

        velocidadeAtual += incremento;
    }

    public void reduzirVelocidade(int decremento) {
        if (velocidadeAtual - decremento < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= decremento;
        }
    }

    public void obterStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
    }

}


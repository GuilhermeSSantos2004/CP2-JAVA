public class Moto extends Veiculo{

    public Moto(String nome, String modelo, int ano, int velocidadeAtual) {
        super(nome, modelo, ano, 120, velocidadeAtual); // Chama o construtor da classe Veiculo
        if (velocidadeAtual > 120){
            System.out.println("Velocidade atual maior que a velocidade máxima. A velocidade atual será ajustada para a velocidade máxima.");
            super.setVelocidadeAtual(120);// Chamada ao método da classe Veiculo
        }
    }


    public void empinar(){
        if(getVelocidadeAtual()<20){
            System.out.println("Velocidade muito baixa para empinar");
        } else if (getVelocidadeAtual()>50) {
            System.out.println("Velocidade muito alta para empinar");
        }
        else{
            System.out.println("EMPINANDOOO!");
        }
    }
}
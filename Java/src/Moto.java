public class Moto extends Veiculo{

    public Moto(String marca, String modelo, int ano, int velocidadeAtual) {
        super(marca, modelo, ano, 120, velocidadeAtual); 
        if (velocidadeAtual > 120){
            System.out.println("Velocidade ajustada para 120 km/h.");
            super.setVelocidadeAtual(120);
        }
    }


    public void empinar(){
        if(getVelocidadeAtual()<20){
            System.out.println("Velocidade muito baixa para empinar.");
        } else if (getVelocidadeAtual()>50) {
            System.out.println("Velocidade muito alta para empinar.");
        }
        else{
            System.out.println("Moto empinando!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

    Moto moto = new Moto("MT-90", "2024", 2024,  23);
    moto.acelerar(10);
    moto.obterStatus();
    moto.empinar();

    Carro carro = new Carro("Hilux", "2005", 2005, 120, true);
    carro.reduzirVelocidade(30);
    carro.desligarArCondicionado();
    carro.obterStatus();

    Caminhao caminhao = new Caminhao("Ford", "2008", 2008, 120, 1000);
    caminhao.diminuirCarga(150);
    caminhao.obterStatus();



    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Moto moto = new Moto("yamaha", "2021", 2020,  22);
    moto.acelerar(10);
    moto.obterStatus();
    moto.empinar();

    Carro carro = new Carro("fiesta", "2008", 2008, 120, true);
    carro.reduzirVelocidade(40);
    carro.desligarArCondicionado();
    carro.obterStatus();

    Caminhao caminhao = new Caminhao("Toyota", "2005", 2005, 120, 1200);
    caminhao.diminuirCarga(200);
    caminhao.obterStatus();



    }
}
package pilares.da.poo;

public class Autodromo {
    public static void main(String[] args) {
        Veiculo jeep = new Carro();
        jeep.setChassi("897897");
        jeep.ligar();
        jeep.getChassi();

        Moto Z400 = new Moto();
        Z400.setChassi("5045030");
        Z400.ligar();
        Z400.getChassi();
    }
}

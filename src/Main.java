
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        miCoche.getPuertas();
        miCoche.agregarPuerta();
        miCoche.getPuertas();
    }
}
class Coche {
    public int puertas = 2;

    public void agregarPuerta(){
        this.puertas++;
    }
    public void getPuertas(){
        System.out.println("Cantidad de puertas: "+ puertas);
    }
}

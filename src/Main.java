
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------Ejercicio A funciones---------------------");
        int resultado = suma(5, 5, 5);
        System.out.println("El resultado de la operacion es: "+ resultado);
        System.out.println("---------------------Ejercicio B clases---------------------");
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        miCoche.getPuertas();
        miCoche.agregarPuerta();
        miCoche.getPuertas();
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
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

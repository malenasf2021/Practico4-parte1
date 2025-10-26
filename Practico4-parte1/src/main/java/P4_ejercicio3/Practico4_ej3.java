
package P4_ejercicio3;
import java.util.Random;


public class Practico4_ej3 {
    public static void main(String[] args) {
        //1. crear objeto para generar numeros aleatorios
        Random aleatorio = new Random();
        int sumaimpares = 0;

        //2. generar una secuencia de enteros aleatorios entre 0 y 10
        /* int n = aleatorio.nextInt(11); //aleatorios de 0 a 10*/
        //3. ir mostrando e indicando los que son o no pares
        //en el caso de los impares sumarlos hasta llegar a 25
        while (sumaimpares <= 25) {
            int n = aleatorio.nextInt(11); //aleatorios de 0 a 10
            if (n % 2 == 0) {
                System.out.println("El nro " + n + "es par");
            } else {
                System.out.println("El nro " + n + "no es es par");
                sumaimpares = sumaimpares + n;

            }
        }
        System.out.println("La suma de impares es: " + sumaimpares);
    }
  
}

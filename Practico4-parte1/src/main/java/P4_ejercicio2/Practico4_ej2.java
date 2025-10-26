
package P4_ejercicio2;
import java.util.Random;


public class Practico4_ej2 {
    public static void main(String[] args) {
        //1. crear objeto para generar numeros aleatorios
        Random aleatorio = new Random();

        //2. generar un valor enteros aleatorios m entre a y b
        int m = aleatorio.nextInt(100) + 1; //aleaotiros de 1  100

        //3. mostrar el valores generado
        System.out.println("El valor randomizado de m es: " + m);
        
        //4. Calcular la suma de los enteros desde 1 hasta m
        int suma =0;
        for(int i=1; i<= m; i++){
            suma=suma+i; //suma+=i
        }
        //5. Mostrar el resultado
        System.out.println("La suma de los enteros desde 1 hasta " + m + " es: " + suma);
    }
}



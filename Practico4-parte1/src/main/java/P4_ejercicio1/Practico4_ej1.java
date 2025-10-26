

package P4_ejercicio1;
import java.util.Random;


public class Practico4_ej1 {

    public static void main(String[] args) {
        
        //1. Se crea objeto para generar numeros aleatorios
        Random aleatorio = new Random();
        
        //2. generar dos valores enteros aleaorios entres a y b
        int a = aleatorio.nextInt(100); //genera un nro. aleatorio en un ranfo de 0 a 99
        int b = aleatorio.nextInt(100); //genera un nro. aleatorio en un ranfo de 0 a 99
        
        //3. mostrar los valores generados
        System.out.println("El valor randomizado de a es: " + a);
        System.out.println("El valor randomizado de b es: " + b);
        
        //4. verificar si b es cero antes de hacer la división
        if(b==0){
            System.out.println("No es posible dividir entre 0 ");
        }else{
            int cociente = a/b;
            int resto = a%b;
            
        //Mostrar los resultados
        System.out.println("Cocientre entre a y b es: " + cociente);
        System.out.println("Resto entre a y b es: " + resto);
        }
        
    }
}

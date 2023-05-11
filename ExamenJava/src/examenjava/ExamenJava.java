package examenjava;
import java.util.Scanner;

/**
 *
 * @author chanp
 */
public class ExamenJava {
    Scanner scanner = new Scanner(System.in);
    
    
    public static void distritos () {
        Scanner scanner = new Scanner(System.in);

        Distrito distrito = new Distrito();

        System.out.print("Ingrese el ID del distrito: ");
        int id = scanner.nextInt();
        distrito.setId(id);

        System.out.print("Ingrese el nombre del distrito: ");
        String nombre = scanner.next();
        distrito.setNombre(nombre);

        System.out.print("Ingrese la latitud del distrito: ");
        double latitud = scanner.nextDouble();
        distrito.setLatitud(latitud);

        System.out.print("Ingrese la longitud del distrito: ");
        double longitud = scanner.nextDouble();
        distrito.setLongitud(longitud);

        System.out.print("Ingrese el número de listado: ");
        int listado = scanner.nextInt();
        distrito.setListado(listado);

        System.out.print("Ingrese el número de votantes: ");
        int votantes = scanner.nextInt();
        distrito.setVotantes(votantes);

        // Cálculos sugeridos
        double porcentajeParticipacion = (double) votantes / listado * 100;
        double porcentajeAbstinencia = (double) (listado - votantes) / listado * 100;
        int faltantes = listado - votantes;

        System.out.println("Porcentaje de participación: " + porcentajeParticipacion + "%");
        System.out.println("Porcentaje de abstinencia: " + porcentajeAbstinencia + "%");
        System.out.println("Faltantes: " + faltantes);
    }
    
    
    
    public static void suma1 () {
          int[] myNum = {10, 3, 6, 20, 5, 8, 30, 7, 2};
       int suma = 0;
        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i]% 1 == 0) {
            suma += myNum[i]; 
        }
            System.out.println(suma);
    }
}
    
    public static void consola (int value) {
        switch (value++) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            default:
                System.out.println("Numero");
                
        }
    }
    
    public static void Final () {
        int value = 5;
        int suma = 10;
        for (int i = 0; i < value; i++) {
            if ((1%2) == 0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }
    
    public static void estructura () {
        int pregunta;
        String esitePregunta;
        int limiteArreglo = 0;
        for (int j = 0; j <= limiteArreglo; j++) {
            int[] arrayPreguntas = null;
            pregunta = arrayPreguntas[j];
            int numPregunta = 0;
            if (numPregunta == pregunta) {
                boolean existePregunta = true;
                break;
            }
            
        }
    }
    
    private static void myMethod () {
        System.out.println("Utilizando un metodo en Java");
    }
    
    
    
    public static void main(String[] args) {
        distritos();
        /*suma1();
        consola(1);
        Final();
        //estructura();
        myMethod();
        //exJavaLPI.myMethod();
*/
    }
    
}


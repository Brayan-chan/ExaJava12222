package examenjava;

/**
 *
 * @author chanp
 */
public class ExamenJava {
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
        suma1();
        consola(1);
        Final();
        //estructura();
        myMethod();
        //exJavaLPI.myMethod();
    }
    
}
